package gr.aueb.cf.ch14.homework;

public class ValidationUtils {

    private ValidationUtils(){}

    public static boolean isLengthValid(String str){
        int len = str.length();
        return(len > 0 && len < 32);
    }

    public static boolean isNumberValid(int num) {
        return(num > 0 && num < 11);
    }
}
