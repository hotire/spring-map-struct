package com.github.hotire.map.struct.getting_started.ex;

import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    User toEntity(final V1User v1User);
    V1User toV1(final User user);
}
