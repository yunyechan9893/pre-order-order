package com.yechan.server.order.order.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UserIdImpl implements ConstraintValidator<UserId, String> {

    private static final Integer MIN_LENGTH = 5;
    private static final Integer MAX_LENGTH = 30;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && value.length() > MIN_LENGTH && value.length() < MAX_LENGTH;
    }
}
