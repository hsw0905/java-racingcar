package org.example;

import java.util.Objects;

public class Position implements Comparable<Position> {

    public static final int MIN_VALUE = 0;
    private int value;

    public Position(int value) {
        validate(value);
        this.value = value;
    }

    private void validate(int value) {
        if (value < MIN_VALUE) {
            throw new IllegalArgumentException("[ERROR] must have positive number");
        }
    }

    public int getValue() {
        return value;
    }

    public void plus() {
        value++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return value == position.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public int compareTo(Position o) {
        return Integer.compare(this.value, o.value);
    }
}
