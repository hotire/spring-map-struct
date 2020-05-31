package com.github.hotire.map.struct.getting_started.spring;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

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

        // when
        final Employee result = mapper.v1ToEmployee(v1Employee);

        // then
        assertThat(result.getId()).isEqualTo(v1Employee.getEmployeeId());
        assertThat(result.getName()).isEqualTo(v1Employee.getEmployeeName());
    }

    @Test
    void givenEmpDTONestedMappingToEmp_whenMaps_thenCorrect() {
        final V1Employee v1Employee = new V1Employee();
        v1Employee.setDivision(new V1Division(1, "hotire"));

        // when
        final Employee result = mapper.v1ToEmployee(v1Employee);

        System.out.println(result);
    }
}