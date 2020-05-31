package com.github.hotire.map.struct.getting_started.spring;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.assertj.core.api.Assertions.assertThat;

class EmployeeMapperTest {

    private final EmployeeMapper mapper
            = Mappers.getMapper(EmployeeMapper.class);
    @Test
    void v1ToEmployee() {
        // given
        final V1Employee v1Employee = new V1Employee();
        v1Employee.setEmployeeId(1);
        v1Employee.setEmployeeName("hotire");
        v1Employee.setEmployeeStartDt("2020-12-25 01:00:01");

        // when
        final Employee result = mapper.v1ToEmployee(v1Employee);

        // then
        assertThat(result.getId()).isEqualTo(v1Employee.getEmployeeId());
        assertThat(result.getName()).isEqualTo(v1Employee.getEmployeeName());
        assertThat(result.getStartDt()).isEqualTo(LocalDateTime.parse(v1Employee.getEmployeeStartDt(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }

    @Test
    void v1ToEmployeeWhenChild() {
        // given
        final V1Employee v1Employee = new V1Employee();
        v1Employee.setDivision(new V1Division(1, "hotire"));

        // when
        final Employee result = mapper.v1ToEmployee(v1Employee);

        // then
        assertThat(result.getDivision().getId()).isEqualTo(v1Employee.getDivision().getId());
        assertThat(result.getDivision().getName()).isEqualTo(v1Employee.getDivision().getName());
    }

    @Test
    void toEntity() {
        // given
        final V2Employee v2Employee = new V2Employee();
        v2Employee.setId(1);
        v2Employee.setName("hotire");

        // when
        final Employee result = mapper.toEntity(v2Employee);

        // then
        assertThat(result.getId()).isEqualTo(v2Employee.getId());
        assertThat(result.getName()).isEqualTo(v2Employee.getName());
    }
}