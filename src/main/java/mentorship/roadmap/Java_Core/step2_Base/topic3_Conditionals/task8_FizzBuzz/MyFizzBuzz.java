package mentorship.roadmap.Java_Core.step2_Base.topic3_Conditionals.task8_FizzBuzz;

public class MyFizzBuzz {

    public static void main(String[] args) {

        int x = 7;
        String str;

        if (x % 3 == 0 && x % 5 == 0) {
            str = "FizzBuzz";
        } else if (x % 3 == 0) {
            str = "Fizz";
        } else if (x % 5 == 0) {
            str = "Buzz";
        } else {
            str = Integer.toString(x);
        }

        System.out.println(str);
    }
}
