package com.github.hotire.map.struct.getting_started.before_after;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public abstract class Car implements CarTypeAware {
    private Long id;
    private String name;
}