package Dec_Therap;

import java.util.ArrayList;
import java.util.List;

public class LongestSubSeq {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ade";

        List<Integer> idx = new ArrayList<>();
        for(int i = 0; i < s2.length(); i++) {
            for(int j=0; j < s1.length(); j++) {
                if(s2.charAt(i) == s1.charAt(j)) {
                    idx.add(j);
                }
            }
        }
        System.out.println(idx);
        int sub = 0;
        for(int i = 0; i < idx.size()-1; i++) {
            if(idx.get(i) > idx.get(i+1)) {
                sub = i;
                break;
            } else {
                sub = idx.size();
            }
        }
        System.out.println(sub);
    }

}
