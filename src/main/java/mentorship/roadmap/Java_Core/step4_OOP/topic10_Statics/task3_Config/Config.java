package mentorship.roadmap.Java_Core.step4_OOP.topic10_Statics.task3_Config;

public class Config {

    private static String configVersion;

    static {
        configVersion = "v1.0.0";
    }

    public static void displayConfig() {
        System.out.println("Текущая версия конфигурации: " + configVersion);
    }
}
