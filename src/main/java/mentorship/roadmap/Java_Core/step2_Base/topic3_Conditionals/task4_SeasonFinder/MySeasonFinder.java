package mentorship.roadmap.Java_Core.step2_Base.topic3_Conditionals.task4_SeasonFinder;

public class MySeasonFinder {

    public static void main(String[] args) {

        int monthnumber = 4;
        String season;

        switch (monthnumber) {
            case 12, 1, 2:
                season = "Зима";
                break;
            case 3, 4, 5:
                season = "Весна";
                break;
            case 6, 7, 8:
                season = "Лето";
                break;
            case 9, 10, 11:
                season = "Осень";
                break;
            default:
                season = "Некорректный номер месяца";
        }

        System.out.println("Месяц: " + monthnumber + ", " + season);
    }
}
