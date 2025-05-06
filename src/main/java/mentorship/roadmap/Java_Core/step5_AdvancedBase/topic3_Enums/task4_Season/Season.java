package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic3_Enums.task4_Season;

public enum Season {
    WINTER(-10),
    SPRING(10),
    SUMMER(20),
    FALL(15);

    private final double averageTemp;

    Season(double averageTemp) {
        this.averageTemp = averageTemp;
    }

    @Override
    public String toString() {
        return "Season: " + name() + ", Avg Temp: " + averageTemp + "°C";
    }
}
