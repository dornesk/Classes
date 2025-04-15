package mentorship.roadmap.Java_Core.step2_Base.topic3_Conditionals.task5_MaxOfThree;

public class MyMaxOfThree {

    public static void main(String[] args) {

        int x = 4;
        int y = 3;
        int z = -1;

        int max;

        if (x > y && x > z) {
            max = x;
        } else if (y > x && y > z) {
            max = y;
        } else {
            max = z;
        }

        System.out.println(max);
    }
}
