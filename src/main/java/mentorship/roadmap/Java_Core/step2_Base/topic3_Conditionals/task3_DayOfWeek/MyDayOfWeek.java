package mentorship.roadmap.Java_Core.step2_Base.topic3_Conditionals.task3_DayOfWeek;

public class MyDayOfWeek {

    public static void main(String[] args) {

        int day = 4;
        String dayName = ""; //чет ругается если не присваиваю сразу
        String dayType = "Рабочий день";

        switch (day) {
            case 1:
                dayName = "Понедельник";
                break;
            case 2:
                dayName = "Вторник";
                break;
            case 3:
                dayName = "Среда";
                break;
            case 4:
                dayName = "Четверг";
                break;
            case 5:
                dayName = "Пятница";
                break;
            case 6:
                dayName = "Суббота";
                dayType = "Выходной";
                break;
            case 7:
                dayName = "Воскресенье";
                dayType = "Выходной";
                break;
            default:
                dayName = "Не задан";
                dayType = "";
        }

        System.out.println("День: " + dayName + ", " + dayType);
    }
}
