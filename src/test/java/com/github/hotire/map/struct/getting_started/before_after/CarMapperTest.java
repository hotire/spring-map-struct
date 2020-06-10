package com.github.hotire.map.struct.getting_started.before_after;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.assertj.core.api.Assertions.assertThat;

class CarMapperTest {

    @Test
    void toV1() {
        // given
        final String name = "hotire";
        final Car car = new KiaCar().setName(name);
        final CarMapper carMapper = Mappers.getMapper(CarMapper.class);

        // when
        final V1Car result = carMapper.toV1(car);

        // then
        assertThat(result.getCarType()).isEqualTo(car.getCarType());
        assertThat(result.getName()).isEqualTo(name.toUpperCase());
    }
}