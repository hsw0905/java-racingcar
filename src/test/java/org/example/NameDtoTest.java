package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class NameDtoTest {
    @Test
    void shouldHaveNamesAndSplitWithComma() {
        assertThatCode(() -> new NameDto("pobi,jun"))
                .doesNotThrowAnyException();
    }

    @Test
    void shouldThrowExceptionWhenInvalidName() {
        assertThatCode(()-> new NameDto("pobi,..."))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatCode(()-> new NameDto("pobi,pobi"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
