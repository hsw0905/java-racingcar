package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

public class CarTest {
    private Car car;
    @BeforeEach
    void setUp() {
        car = new Car(new Name("Harry"), new Position(0));
    }

    @Test
    void shouldHaveNameAndPosition() {
        assertThatCode(() -> new Car(new Name("name"), new Position(1)))
                .doesNotThrowAnyException();
    }

    @Test
    void shouldMoveWhenNumberIsGraterThan4() {
        assertThat(car.isMoved(4)).isTrue();
        assertThat(car.position()).isEqualTo(new Position(1));
    }

    @Test
    void shouldNotMoveWhenNumberIsLessThan4() {
        assertThat(car.isMoved(3)).isFalse();
        assertThat(car.position()).isEqualTo(new Position(0));
    }
}
