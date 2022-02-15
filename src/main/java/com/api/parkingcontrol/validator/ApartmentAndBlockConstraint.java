package com.api.parkingcontrol.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * @Autor Jairo Nascimento
 * @Created 15/02/2022 - 11:24
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {ApartmentAndBlockValidator.class})
public @interface ApartmentAndBlockConstraint {
    String message() default "Conflict: Parking Spot already registered for this apartment/block!";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
