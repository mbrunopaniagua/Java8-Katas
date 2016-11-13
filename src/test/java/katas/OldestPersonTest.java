package katas;

import bean.Person;
import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class OldestPersonTest {
//    Get oldest person from the collection
    @Test
    public void getOldestPersonShouldReturnOldestPerson() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> people = asList(sara, eva, viktor);
        assertThat(OldestPerson.getOldestPerson(people), is(new Person("Eva", 42)));
    }

    @Test(expected = NoSuchElementException.class)
    public void whenThereAreNotPeopleOldestPersonShouldReturnZero() {
        List<Person> people = Collections.emptyList();
        OldestPerson.getOldestPerson(people);
    }

}
