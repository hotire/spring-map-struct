package com.github.hotire.map.struct.getting_started.spring;

public interface EntityMapper<Entity, VxEntity> {
    Entity toEntity(final VxEntity vo);
    VxEntity toVo(final Entity entity);
}
