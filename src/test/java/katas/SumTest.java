package katas;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SumTest {
    @Test
    public void sumAllElementsOfACollection() {
        List<Integer> numbers = asList(1, 2, 3, 4, 5);
        assertThat(Sum.calculate(numbers), is(15));
    }

}
