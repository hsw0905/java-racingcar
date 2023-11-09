package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {
    @Test
    void findWinners() {
        Car harry = new Car(new Name("Harry"), new Position(5));
        Car pobi = new Car(new Name("Pobi"), new Position(5));
        Car ron = new Car(new Name("Ron"), new Position(4));

        Cars cars = new Cars(Arrays.asList(harry, pobi, ron));
        Winner winners = cars.findWinners();

        assertThat(winners.getNames()).isEqualTo(Arrays.asList(new Name("Harry"), new Name("Pobi")));
    }
}
