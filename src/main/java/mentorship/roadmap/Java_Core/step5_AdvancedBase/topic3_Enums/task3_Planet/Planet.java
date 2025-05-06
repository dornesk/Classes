package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic3_Enums.task3_Planet;

public enum Planet {
    EARTH(5.96e24, 6.378e6),
    MARS(6.4e23, 3.488e6),
    JUPITER(1.8987e27, 71.3e6);

    private final double G = 6.67430e-11;
    private final double mass;
    private final double radius;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double surfaceGravity() {
        return G * mass / (radius * radius);
    }
}
