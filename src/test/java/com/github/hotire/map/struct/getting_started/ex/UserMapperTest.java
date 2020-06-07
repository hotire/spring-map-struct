package com.github.hotire.map.struct.getting_started.ex;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.assertj.core.api.Assertions.assertThat;

class UserMapperTest {

    private final UserMapper mapper
            = Mappers.getMapper(UserMapper.class);

    @Test
    void toEntity() {
        // given
        final V1User v1User = new V1User();
        v1User.setName("hotire");
        v1User.setId(1L);

        // when
        final User result = mapper.toEntity(v1User);

        // then
        assertThat(result.getName()).isEqualTo(v1User.getName());
        assertThat(result.getId()).isEqualTo(v1User.getId());
    }
    @Test
    void toV1() {
        // given
        final User user = new User();
        user.setName("hotire");
        user.setId(1L);

        // when
        final V1User result = mapper.toV1(user);

        // then
        assertThat(result.getName()).isEqualTo(user.getName());
        assertThat(result.getId()).isEqualTo(user.getId());
    }
}