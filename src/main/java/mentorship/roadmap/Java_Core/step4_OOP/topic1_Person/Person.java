package mentorship.roadmap.Java_Core.step4_OOP.topic1_Person;

public class Person {

    private String  name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public void displayInfo() {
        System.out.println("Name: " + this.getName() + ", Age: " + this.getAge());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Возраст не может быть отрицательным числом.");
            this.age = 0;
        }
    }
}
