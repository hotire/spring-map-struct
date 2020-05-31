package com.github.hotire.map.struct.getting_started.spring;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Employee {
    private Integer id;
    private String name;
    private Division division;
    private LocalDateTime startDt;
}
