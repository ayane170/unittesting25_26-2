package week1.week1_revesion;

public class StringUtils {
    boolean isPalindrome(String str) {
        int i = 0 , j = str.length()-1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    boolean isUpperCase(String str) {
       return str.equals(str.toUpperCase());
    }
}
