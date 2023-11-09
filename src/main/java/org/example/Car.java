package org.example;

public record Car(Name name, Position position) {
    public static final int THRESHOLD = 4;

    public boolean isMoved(int number) {
        if (number >= THRESHOLD) {
            position.plus();
            return true;
        }
        return false;
    }

    public boolean isSamePosition(Position maxPosition) {
        return position.equals(maxPosition);
    }
}
