package com.global.inbox.validator;

import com.global.inbox.validator.annotation.ValidEmail;
import org.apache.commons.validator.routines.EmailValidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.List;

public class UserEmailValidator implements ConstraintValidator<ValidEmail, String> {

    @Override
    public void initialize(ValidEmail constraintAnnotation) {

    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        List<String> messages = new ArrayList<>();

        if (!EmailValidator.getInstance(true, true).isValid(email)) {
            messages.add("email is not valid");
        }

        if (messages.isEmpty()) {
            return true;
        }

        String messageTemplate = String.join(", ", messages);
        constraintValidatorContext.buildConstraintViolationWithTemplate(messageTemplate)
                .addConstraintViolation()
                .disableDefaultConstraintViolation();
        return false;
    }
}