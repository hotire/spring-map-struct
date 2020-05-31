package com.github.hotire.map.struct;

import com.github.hotire.map.struct.getting_started.SimpleDestination;
import com.github.hotire.map.struct.getting_started.SimpleSource;
import com.github.hotire.map.struct.getting_started.SimpleSourceDestinationMapper;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.assertj.core.api.Assertions.assertThat;

class SimpleSourceDestinationMapperTest {
    private final SimpleSourceDestinationMapper mapper
            = Mappers.getMapper(SimpleSourceDestinationMapper.class);

    @Test
    void sourceToDestination() {
        // given
        final SimpleSource simpleSource = new SimpleSource();
        simpleSource.setName("SourceName");
        simpleSource.setDescription("SourceDescription");

        // when
        final SimpleDestination result = mapper.sourceToDestination(simpleSource);

        // then
        assertThat(result.getName()).isEqualTo(simpleSource.getName());
        assertThat(result.getDescription()).isEqualTo(simpleSource.getDescription());
    }
    @Test
    void destinationToSource() {
        // given
        final SimpleDestination destination = new SimpleDestination();
        destination.setName("DestinationName");
        destination.setDescription("DestinationDescription");

        // when
        final SimpleSource result = mapper.destinationToSource(destination);

        // then
        assertThat(result.getName()).isEqualTo(destination.getName());
        assertThat(result.getDescription()).isEqualTo(destination.getDescription());
    }
}