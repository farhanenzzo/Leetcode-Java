package March24.StringManipulation;

// todo : https://leetcode.com/problems/first-letter-to-appear-twice/description/

import java.util.HashSet;
import java.util.Set;

public class FirstLetterAppearTwice {
    public static char appearedTwice(String str) {
        char c = 0;
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < str.length(); i++) {
            if(set.contains(str.charAt(i))) {
                c = str.charAt(i);
            } else {
                set.add(str.charAt(i));
            }
        }
        return c;
    }
    public static void main(String[] args) {
        String str = "abccbaacz";

        System.out.println(appearedTwice(str));
    }
}
