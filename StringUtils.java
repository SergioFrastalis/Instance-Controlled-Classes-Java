package gr.aueb.cf.ch14.homework;

public class StringUtils {

    private StringUtils() {}

    public static String reverseString(String originalStr) {
        StringBuilder reversedStr = new StringBuilder();
        for (int i = originalStr.length() - 1; i >= 0; i--) {
            reversedStr.append(originalStr.charAt(i));
        }
        return reversedStr.toString();
    }

    public static boolean isPalindrome(String str1) {
        StringBuilder str2 = new StringBuilder();
        for (int i = str1.length() - 1; i >= 0; i--) {
            str2.append(str1.charAt(i));
        }
        return str1.contentEquals(str2);
    }

    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }
}
