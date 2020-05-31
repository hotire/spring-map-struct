package com.github.hotire.map.struct.getting_started.spring;

import lombok.Data;

@Data
public class V2Employee {
    private Integer id;
    private String name;
    private V1Division division;
}
