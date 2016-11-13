package katas;

import bean.Person;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class OldestPerson {
    public static Person getOldestPerson(List<Person> list) {
        Optional<Person> optional = list.stream().max(Comparator.comparing(Person::getAge));
        if (optional.isPresent()) {
            return optional.get();
        }
        throw new NoSuchElementException("No value present");
    }
}
