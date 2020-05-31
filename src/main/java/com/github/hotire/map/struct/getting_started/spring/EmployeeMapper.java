package com.github.hotire.map.struct.getting_started.spring;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface EmployeeMapper extends EntityMapper<Employee, V2Employee> {
    @Mappings({
            @Mapping(target = "employeeId", source = "entity.id"),
            @Mapping(target = "employeeName", source = "entity.name"),
            @Mapping(target = "employeeStartDt", source = "entity.startDt", dateFormat = "yyyy-MM-dd HH:mm:ss")
    })
    V1Employee employeeToV1(final Employee entity);

    @Mappings({
            @Mapping(target = "id", source = "v1.employeeId"),
            @Mapping(target = "name", source = "v1.employeeName"),
            @Mapping(target = "startDt", source = "v1.employeeStartDt", dateFormat = "yyyy-MM-dd HH:mm:ss")
    })
    Employee v1ToEmployee(final V1Employee v1);

    V1Division divisionToV1(final Division entity);

    Division v1ToDivision(final V1Division v1);

}
