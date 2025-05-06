package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic3_Enums.task2_Color;

public class ColorDemo {

    public static void main(String[] args) {
        for (Color color : Color.values()) {
            System.out.println(color + ": " + color.getHexCode());
        }
    }
}
