package mentorship.roadmap.Java_Core.step2_Base.topic3_Conditionals.task1_GradeBonus;

public class MyGradeBonus {
    public static void main(String[] args) {

        int grade = 3;
        int bonus;

        if (grade == 5) {
            bonus = 100;
        } else if (grade == 4) {
            bonus = 75;
        } else if (grade == 3) {
            bonus = 50;
        } else {
            bonus = 0;
        }

        System.out.println("бонус = " + bonus);
    }
}
