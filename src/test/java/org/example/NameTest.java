package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;

public class NameTest {
    @ParameterizedTest
    @ValueSource(strings = {"abcdef", "", " ", "!@#"})
    void shouldHaveValidName(String value) {
        assertThatCode(() -> new Name(value))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] Invalid Name");
    }

}
