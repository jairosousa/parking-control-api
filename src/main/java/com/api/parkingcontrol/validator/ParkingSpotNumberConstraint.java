package com.api.parkingcontrol.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * @Autor Jairo Nascimento
 * @Created 15/02/2022 - 09:11
 */
@Documented
@Constraint(validatedBy = ParkingSpotNumberValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ParkingSpotNumberConstraint {
    String message() default "Conflict: Parking Spot is already in use!";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
