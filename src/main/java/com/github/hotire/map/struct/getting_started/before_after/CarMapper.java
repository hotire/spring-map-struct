package com.github.hotire.map.struct.getting_started.before_after;

import org.mapstruct.AfterMapping;
import org.mapstruct.BeforeMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.Optional;

@Mapper
public abstract class CarMapper {

    @BeforeMapping
    protected void setType(final Car car, @MappingTarget final V1Car v1Car) {
        v1Car.setCarType(car.getCarType());
    }

    @AfterMapping
    protected void toUpperCase(@MappingTarget V1Car v1Car) {
        v1Car.setName(Optional.ofNullable(v1Car.getName()).map(String::toUpperCase).orElse(null));
    }

    public abstract V1Car toV1(Car car);
}
