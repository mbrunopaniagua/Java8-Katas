package katas;

import java.util.List;

public class Sum {

    public static Integer calculate(List<Integer> list) {
        //return list.stream().mapToInt(Integer::intValue).sum();
        return list.stream().reduce(0, Integer::sum);
    }
}
