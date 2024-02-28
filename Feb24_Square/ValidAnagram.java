package Feb24_Square;

import java.util.Arrays;

public class ValidAnagram {

    public static String checkString(String str) {
        char[] lst = str.toCharArray();
        Arrays.sort(lst);

        return new String(lst);
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        if(checkString(s1).equals(checkString(s2))) {
            System.out.println("Valid");
        } else {
            System.out.println("In valid");
        }
    }
}

/*
Two strings are valid anagrams of each other if they contain
the same characters with the same frequency, disregarding
the order of characters.
 */

