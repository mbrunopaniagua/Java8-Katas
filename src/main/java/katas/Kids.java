package katas;

import bean.Person;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

public class Kids {

    public static Set<String> getKidNames(List<Person> list) {
        return list.stream().filter((Person p) -> p.getAge() < 18).map(Person::getName).collect(toSet());
    }
}
