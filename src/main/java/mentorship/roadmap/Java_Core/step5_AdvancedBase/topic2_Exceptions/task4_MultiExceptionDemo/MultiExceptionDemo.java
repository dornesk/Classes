package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic2_Exceptions.task4_MultiExceptionDemo;

public class MultiExceptionDemo {

    public static void main(String[] args) {
        int[] arr = new int[5];
        String str = null;

        try {
            System.out.println(arr[6]);
            System.out.println(str.charAt(3));
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Ошибка. " + e.getMessage());
        }
    }
}
