package katas;

import bean.Person;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsCollectionContaining.hasItems;

public class GroupingTest {
    /*
        Group people by nationality
    */

    @Test
    public void partitionAdultsShouldSeparateKidsFromAdults() {
        Person sara = new Person("Sara", 4, "Norwegian");
        Person viktor = new Person("Viktor", 40, "Serbian");
        Person eva = new Person("Eva", 42, "Norwegian");
        List<Person> collection = asList(sara, eva, viktor);
        Map<String, List<Person>> result = Grouping.groupByNationality(collection);
        assertThat(result.get("Norwegian"), hasItems(sara, eva));
        assertThat(result.get("Serbian"), hasItems(viktor));
    }
}