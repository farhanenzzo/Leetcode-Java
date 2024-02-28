package Feb24_Square;

public class ValidPalindrome {
    public static boolean checkPalindrome(String str) {
        int low = 0;
        int high = str.length() - 1;

        while(low < high) {
            if(str.charAt(low) != str.charAt(high)) {
                return false;
            }
            low ++;
            high --;
        }
        return true;
    }
    public static void main(String[] args) {
        String s2 = "abba";
        if(checkPalindrome(s2)) {
            System.out.println("valid");
        } else {
            System.out.println("not valid");
        }
    }
}

/*
Therefore, a string to be valid palindrome,
it must have the same sequence of characters when read forward and backward.
 */

/*
String s1 = "A man, a plan, a canal, Panama!";
System.out.println(s1.replaceAll("[^a-zA-Z]", "").toLowerCase());
 */