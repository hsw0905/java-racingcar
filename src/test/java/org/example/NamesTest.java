package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class NamesTest {
    @Test
    void shouldHaveNamesAndSplitWithComma() {
        assertThatCode(() -> new Names("pobi,jun"))
                .doesNotThrowAnyException();
    }

    @Test
    void shouldThrowExceptionWhenInvalidName() {
        assertThatCode(()-> new Names("pobi,..."))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatCode(()-> new Names("pobi,pobi"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
