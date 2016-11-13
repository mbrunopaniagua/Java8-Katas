package katas;

import java.util.Collection;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class FlatCollection {
    public static List<String> transform (List<List<String>> list) {
        return list.stream().flatMap(Collection::stream).collect(toList());
    }
}
