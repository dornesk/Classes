package mentorship.roadmap.Java_Core.step2_Base.topic3_Conditionals.task2_AgeCategory;

public class MyAgeCategory {
    public static void main(String[] args) {

        int age = 17;
        String category = "Категория неизвестна";

        if (age < 13) {
            category = "Ребенок";
        } else if (age < 20) {
            category = "Подросток";
        } else if (age < 65) {
            category = "Взрослый";
        } else if (age >= 65) {
            category = "Пожилой";
        }

        System.out.println("Возраст: " + age);
        System.out.println("Категория: " + category);
    }
}
