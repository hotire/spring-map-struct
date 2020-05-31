package com.github.hotire.map.struct.getting_started.spring;

import lombok.Data;

@Data
public class V1Employee {
    private Integer employeeId;
    private String employeeName;
    private V1Division division;
}
