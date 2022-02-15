package com.api.parkingcontrol.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * @Autor Jairo Nascimento
 * @Created 15/02/2022 - 10:08
 */
@Documented
@Constraint(validatedBy = LicensePlateCarValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface LicensePlateCarConstraint {
    String message() default "Conflict: License Plate Car is already in use!";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
