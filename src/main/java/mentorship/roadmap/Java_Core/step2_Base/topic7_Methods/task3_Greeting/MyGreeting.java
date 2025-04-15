package mentorship.roadmap.Java_Core.step2_Base.topic7_Methods.task3_Greeting;

public class MyGreeting {

    public static void main(String[] args) {
        String name = "qwerty";
        System.out.println(getGreeting(name));
    }

    public static String getGreeting(String name) {

        return "Привет, " + name + "!";
    }
}
