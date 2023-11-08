package org.example;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public record Name(String value) {
    public static final Pattern PATTERN = Pattern.compile("[a-zA-Z]{1,5}");

    public Name {
        validate(value);
    }

    private void validate(String name) {
        Matcher matcher = PATTERN.matcher(name);
        if (Objects.isNull(name) || !matcher.matches()) {
            throw new IllegalArgumentException("[ERROR] Invalid Name");
        }
    }
}
