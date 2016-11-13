package katas;

import bean.Person;

import java.util.IntSummaryStatistics;
import java.util.List;

import static java.util.stream.Collectors.summarizingInt;

public class PeopleStats {
    public static IntSummaryStatistics getStats(List<Person> people) {
        return people.stream().collect(summarizingInt(Person::getAge));
    }
}
