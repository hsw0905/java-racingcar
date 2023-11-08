package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class CarTest {
    @Test
    void shouldHaveName() {
        assertThatCode(() -> new Car(new Name("name")))
                .doesNotThrowAnyException();
    }


}
