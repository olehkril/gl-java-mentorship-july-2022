package com.global.inbox.validator;

import com.global.inbox.validator.annotation.ValidPassword;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

@Component
public class PasswordValidator implements ConstraintValidator<ValidPassword, String> {

    @Override
    public void initialize(ValidPassword constraintAnnotation) {
    }

    @Override
    public boolean isValid(@NonNull String password, ConstraintValidatorContext constraintValidatorContext) {

        List<String> messages = new ArrayList<>();

        if (password.length() < 8 || password.length() > 256) {
            messages.add("password must have at least eight characters");
        }

        if (!Pattern.matches(".*[0-9]+.*", password)) {//NOSONAR
            messages.add("password must contain at least one digit");
        }

        if (!Pattern.matches(".*?[#git?!@$%^&*-].*", password)) {//NOSONAR
            messages.add("password must contain at least one special character");
        }
        if(!Pattern.matches(".*?[A-Z].*", password)){//NOSONAR
            messages.add("password must contain at least one upper case letter");
        }

        if(!Pattern.matches(".*?[a-z].*", password)){//NOSONAR
            messages.add("password must contain at least one lower case letter");
        }

        if(password.contains(" ")){
            messages.add("password cannot contain white spaces");
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
