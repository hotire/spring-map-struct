package com.github.hotire.map.struct;

import com.github.hotire.map.struct.getting_started.SimpleDestination;
import com.github.hotire.map.struct.getting_started.SimpleSource;
import com.github.hotire.map.struct.getting_started.SimpleSourceDestinationMapper;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleSourceDestinationMapperTest {
    private final SimpleSourceDestinationMapper mapper
            = Mappers.getMapper(SimpleSourceDestinationMapper.class);

    @Test
    void givenSourceToDestination_whenMaps_thenCorrect() {
        // given
        final SimpleSource simpleSource = new SimpleSource();
        simpleSource.setName("SourceName");
        simpleSource.setDescription("SourceDescription");

        // when
        final SimpleDestination destination = mapper.sourceToDestination(simpleSource);

        // then
        assertEquals(simpleSource.getName(), destination.getName());
        assertEquals(simpleSource.getDescription(),
                destination.getDescription());
    }
    @Test
    void givenDestinationToSource_whenMaps_thenCorrect() {
        // given
        final SimpleDestination destination = new SimpleDestination();
        destination.setName("DestinationName");
        destination.setDescription("DestinationDescription");

        // when
        final SimpleSource source = mapper.destinationToSource(destination);

        // then
        assertEquals(destination.getName(), source.getName());
        assertEquals(destination.getDescription(),
                source.getDescription());
    }
}