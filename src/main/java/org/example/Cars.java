package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public Winner findWinners() {
        Position maxPosition = getMaxPosition();
        List<Car> winners = cars.stream()
                .filter(car -> car.isSamePosition(maxPosition))
                .collect(Collectors.toList());
        return new Winner(winners);
    }

    private Position getMaxPosition() {
        return cars.stream()
                .max(Comparator.comparing(Car::position))
                .orElseThrow(IllegalArgumentException::new)
                .position();
    }
}
