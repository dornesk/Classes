package mentorship.roadmap.Java_Core.step2_Base.topic7_Methods.task8_PalindromeChecker;

public class MyPalindromeChecker {

    public static void main(String[] args) {
        String a = "12ф кф 21";
        System.out.println(isPalindrome(a));
    }

    public static boolean isPalindrome(String text) {
        String text1 = text.toLowerCase(); //приводим к нижнему регистру
        text1 = text1.replaceAll("\\s+", ""); //убираем пробельные символы
        int l = text1.length();

        for (int i = 0; i < l / 2; i++) {
            if (text1.charAt(i) != text1.charAt(l - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
