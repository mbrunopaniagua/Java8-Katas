package katas;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class FilterCollection {
    public static List<String> transform(List<String> list) {
        return list.stream().filter((String s) -> s.length() < 4).collect(toList());
    }
}
