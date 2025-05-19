package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task9_PersonToMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonToMapDemo {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Anna",9),
                new Person("Peter",19),
                new Person("Grace",91),
                new Person("John",29),
                new Person("Claire",39)
                );

        Map<String, Integer> peopleToMap = people.stream()
                .collect(Collectors.toMap(Person::getName, Person::getAge));

        for (Map.Entry<String, Integer> m : peopleToMap.entrySet()) {
            System.out.println(m.getKey() + ", age: " + m.getValue());
        }
    }
}
