package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class PositionTest {
    @Test
    void shouldHavePositiveNumber() {
        assertThatCode(() -> new Position(-1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] must have positive number");
    }
}
