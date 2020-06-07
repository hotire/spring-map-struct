package com.github.hotire.map.struct.getting_started.before_after;

import lombok.Data;

@Data
public class V1Car implements CarTypeAware {
    private Long id;
    private String name;
    private CarType carType;
}
