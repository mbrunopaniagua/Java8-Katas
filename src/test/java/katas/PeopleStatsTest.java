package katas;

import bean.Person;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PeopleStatsTest {
    /*
        Get people statistics: average age, count, maximum age, minimum age and sum og all ages.
    */
    private Person sara = new Person("Sara", 4);
    private Person viktor = new Person("Viktor", 40);
    private Person eva = new Person("Eva", 42);
    private List<Person> poeple = asList(sara, eva, viktor);

    @Test
    public void getStatsShouldReturnAverageAge() {
        assertThat(PeopleStats.getStats(poeple).getAverage(), is((double)(4 + 40 + 42) / 3));
    }

    @Test
    public void getStatsShouldReturnNumberOfPeople() {
        assertThat(PeopleStats.getStats(poeple).getCount(), is(3L));
    }

    @Test
    public void getStatsShouldReturnMaximumAge() {
        assertThat(PeopleStats.getStats(poeple).getMax(), is(42));
    }

    @Test
    public void getStatsShouldReturnMinimumAge() {
        assertThat(PeopleStats.getStats(poeple).getMin(), is(4));
    }

    @Test
    public void getStatsShouldReturnSumOfAllAges() {
        assertThat(PeopleStats.getStats(poeple).getSum(), is(86L));
    }

}
