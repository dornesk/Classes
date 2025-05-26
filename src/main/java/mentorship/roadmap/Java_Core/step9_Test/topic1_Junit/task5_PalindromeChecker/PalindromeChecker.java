package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task5_PalindromeChecker;

public class PalindromeChecker {
    public static boolean isPalindrome(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        } else {
            String pureText = text.replaceAll("[\\p{Punct}\\s]", "").toLowerCase();
            String reversed = new StringBuilder(pureText).reverse().toString();
            return pureText.equals(reversed);
        }
    }
}
