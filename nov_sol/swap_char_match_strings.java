package nov_sol;

import java.util.ArrayList;
import java.util.List;

public class swap_char_match_strings {
    public static boolean swap(String s1, String s2) {
        if(s1.equals(s2)) {
            return true;
        }
        if(s1.length() != s2.length()) {
            return false;
        }

        List<Integer> unmatchedIdx = new ArrayList<>();
        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                unmatchedIdx.add(i);
            }
        }

        if(unmatchedIdx.size() != 2) {
            return false;
        }

        return s1.charAt(unmatchedIdx.get(0)) == s2.charAt(unmatchedIdx.get(1))
                && s1.charAt(unmatchedIdx.get(1)) == s2.charAt(unmatchedIdx.get(0));

    }
    public static void main(String[] args) {
        String s1 = "bank";
        String s2 = "kanb";

        System.out.println(swap(s1, s2));
    }
}
