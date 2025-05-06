package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic3_Enums.task3_Planet;

public class PlanetDemo {

    public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            System.out.println("Гравитация планеты " + planet + ": " + String.format("%.3f",planet.surfaceGravity()));
        }
    }
}
