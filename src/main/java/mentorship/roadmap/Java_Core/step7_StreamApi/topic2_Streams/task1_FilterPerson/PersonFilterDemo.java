package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task1_FilterPerson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonFilterDemo {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Anna", 10),
                new Person("Lynn", 1),
                new Person("Peter", 31),
                new Person("John", 40),
                new Person("Grace", 20));

        List<Person> filtered = people.stream()
                .filter(a -> a.age > 30)
                .collect(Collectors.toList());

        System.out.println("Люди, чей возраст больше 30:");

        for (Person p : filtered) {
            System.out.println(p.name + ", " + p.age);
        }
    }
}
