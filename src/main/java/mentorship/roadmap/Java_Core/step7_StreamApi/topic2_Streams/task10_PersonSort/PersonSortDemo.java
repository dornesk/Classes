package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task10_PersonSort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonSortDemo {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", 8),
                new Person("Kelly", 18),
                new Person("May", 81)
                );

        List<Person> sortedPeople = people.stream()
                .sorted(Comparator.comparingInt(Person::getAge)
                        .thenComparing(Person::getName))
                .collect(Collectors.toList());

        sortedPeople.forEach((person ->
                System.out.println("Name: " + person.getName() + ", age: " + person.getAge())));
    }
}
