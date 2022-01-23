package com.github.hotire.map.struct.getting_started;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

/**
 * @TypeExcludeFilters(WebMvcTypeExcludeFilter.class)
 * @see org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTypeExcludeFilter
 */
@WebMvcTest(SimpleController.class)
class SimpleControllerTest {

    @Test
    void di() {

    }
}