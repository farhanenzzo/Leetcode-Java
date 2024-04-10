package March24.StringManipulation;
// todo : https://www.youtube.com/watch?v=q9GlOPFU_EE
// todo : https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/

import java.util.ArrayList;
import java.util.List;

public class CheckAcronym {
    public static boolean isAcronym(List<String> list, String acronym) {
        if(list.size() != acronym.length()) {
            return false;
        }

        for(int i = 0; i < acronym.length(); i++) {
            if(list.get(i).charAt(0) != acronym.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String[] words = {"alice","bob","charlie"};
        List<String> list = new ArrayList<>();
        list.add("afqcpzsx");
        list.add("icenu");

        String acronym = "yi";

        System.out.println(isAcronym(list, acronym));
    }
}
