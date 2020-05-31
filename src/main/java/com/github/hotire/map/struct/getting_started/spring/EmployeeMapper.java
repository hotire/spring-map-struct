package com.github.hotire.map.struct.getting_started.spring;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    @Mappings({
            @Mapping(target = "employeeId", source = "entity.id"),
            @Mapping(target = "employeeName", source = "entity.name")
    })
    V1Employee employeeToV1(final Employee entity);

    @Mappings({
            @Mapping(target = "id", source = "v1.employeeId"),
            @Mapping(target = "name", source = "v1.employeeName")
    })
    Employee v1ToEmployee(final V1Employee v1);
}
