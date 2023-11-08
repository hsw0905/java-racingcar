package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class NameDto {
    public static final String DELIMITER = ",";
    public static final int SPLIT_LIMIT = -1;
    private final List<Name> names = new ArrayList<>();

    public NameDto(String names) {
        String[] splitNames = SplitNames(names);

        validate(splitNames);
        for (String name : splitNames) {
            this.names.add(new Name(name));
        }
    }

    private void validate(String[] splitNames) {
        if (!Arrays.stream(splitNames).allMatch(new HashSet<>()::add)) {
            throw new IllegalArgumentException("자동차 이름은 중복될 수 없습니다.");
        }
    }

    private String[] SplitNames(String names) {
        return names.split(DELIMITER, SPLIT_LIMIT);
    }

    public List<Name> getNames() {
        return names;
    }
}
