package com.yechan.server.order.order.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Constraint(validatedBy = UserIdImpl.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface UserId {

    String message() default "유저 아이디는 5자 이상 30자 미만이어야합니다";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
