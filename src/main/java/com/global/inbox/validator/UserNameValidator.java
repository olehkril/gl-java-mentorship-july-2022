package com.global.inbox.validator;

import com.global.inbox.validator.annotation.ValidUserName;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserNameValidator implements ConstraintValidator<ValidUserName, String> {

    @Override
    public void initialize(ValidUserName constraintAnnotation) {

    }

    @Override
    public boolean isValid(String username, ConstraintValidatorContext constraintValidatorContext) {
        List<String> messages = new ArrayList<>();
        int usernameMinLength = 3;

        if (username == null || username.trim().length() < usernameMinLength || username.trim().length() > 129) {
            messages.add(String.format("username must have at least %s characters", usernameMinLength));
        }

        if (username != null) {
            if (!StandardCharsets.US_ASCII.newEncoder().canEncode(username)) {
                messages.add("username must contain Latin characters");
            }

            String allowedChars = "!@#^&*?.,\\-_+=";
            Matcher matcher = Pattern.compile(String.format("^[a-zA-Z0-9%s]+", allowedChars)).matcher(username);
            if (!matcher.matches()) {
                messages.add("username can contain Latin letters, numbers, and special characters: (!,@,#,^,&,*,?,.,,,-,_,+,=)");
            }
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

