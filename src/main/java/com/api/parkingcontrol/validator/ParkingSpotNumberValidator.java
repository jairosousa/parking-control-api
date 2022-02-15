package com.api.parkingcontrol.validator;

import com.api.parkingcontrol.services.ParkingSpotService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @Autor Jairo Nascimento
 * @Created 15/02/2022 - 09:13
 */
public class ParkingSpotNumberValidator implements ConstraintValidator<ParkingSpotNumberConstraint, String> {

    @Autowired
    ParkingSpotService parkingSpotService;

    public void initialize(ParkingSpotNumberConstraint constraint) {
    }

    public boolean isValid(String contactField, ConstraintValidatorContext context) {
        return !parkingSpotService.existsByParkingSpotNumber(contactField);
    }
}
