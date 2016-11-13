package katas;

import bean.Person;

import java.util.List;

import static java.util.stream.Collectors.joining;

public class Joining {

    public static String namesToString(List<Person> people) {
        return people.stream().map(Person::getName).collect(joining(", ", "Names: ", "."));
    }
}
