package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Winner {

    private final List<Car> cars;

    public Winner(List<Car> cars) {
        this.cars = cars;
    }

    public List<Name> getNames() {
        return cars.stream()
                .map(Car::name)
                .collect(Collectors.toList());
    }
}
