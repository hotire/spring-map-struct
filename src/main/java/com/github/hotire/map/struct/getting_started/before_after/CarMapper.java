package com.github.hotire.map.struct.getting_started.before_after;

import org.mapstruct.AfterMapping;
import org.mapstruct.BeforeMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public abstract class CarMapper {

    @BeforeMapping
    protected void setType(final Car car, @MappingTarget final V1Car v1Car) {
        v1Car.setCarType(car.getCarType());
    }

    @AfterMapping
    protected void toUpperCase(@MappingTarget V1Car v1Car) {
        v1Car.setName(v1Car.getName().toUpperCase());
    }

    public abstract V1Car toV1(Car car);
}
