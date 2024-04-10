package March24.TwoPointer.SlidingWindow;

import java.util.HashMap;
import java.util.Map;
// todo: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

public class LongestSubstringWithoutRepeats {
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                start = Math.max(start, map.get(s.charAt(i)) + 1);
            }
            max = Math.max(max, i - start + 1);
            map.put(s.charAt(i), i);
        }
        return max;
    }

    public static void main(String[] args) {
        String str = "abcabcdb";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
