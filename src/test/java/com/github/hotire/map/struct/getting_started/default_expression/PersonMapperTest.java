package com.github.hotire.map.struct.getting_started.default_expression;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonMapperTest {

    @Test
    void toV1() {
        // given
        final Person person = new Person();
        final PersonMapper personMapper = PersonMapper.INSTANCE;

        // when
        final V1Person result = personMapper.toV1(person);

        // then
        Assertions.assertThat(result.getId()).isNotNull();
    }
}