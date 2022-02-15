package com.api.parkingcontrol.validator;

import com.api.parkingcontrol.services.ParkingSpotService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

/**
 * @Autor Jairo Nascimento
 * @Created 15/02/2022 - 10:08
 */
public class LicensePlateCarValidator implements ConstraintValidator<LicensePlateCarConstraint, String> {

    @Autowired
    ParkingSpotService parkingSpotService;

    @Override
    public void initialize(LicensePlateCarConstraint constraintAnnotation) {

    }

    @Override
    public boolean isValid(String contactField, ConstraintValidatorContext constraintValidatorContext) {
        return !parkingSpotService.existsByLicensePlateCar(contactField);
    }
}
