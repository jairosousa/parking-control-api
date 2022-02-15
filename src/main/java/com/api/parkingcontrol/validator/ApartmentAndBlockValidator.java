package com.api.parkingcontrol.validator;

import com.api.parkingcontrol.dtos.ParkingSpotDto;
import com.api.parkingcontrol.services.ParkingSpotService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;

/**
 * @Autor Jairo Nascimento
 * @Created 15/02/2022 - 11:25
 */
public class ApartmentAndBlockValidator implements ConstraintValidator<ApartmentAndBlockConstraint, ParkingSpotDto> {

        @Autowired
        ParkingSpotService parkingSpotService;

        @Override
        public void initialize(ApartmentAndBlockConstraint constraintAnnotation) {

        }

        @Override
        public boolean isValid(ParkingSpotDto parkingSpotDto, ConstraintValidatorContext constraintValidatorContext) {
                boolean exists = parkingSpotService.existsByApartmentAndBlock(parkingSpotDto.getApartment(), parkingSpotDto.getBlock());
                return !exists;
        }
}
