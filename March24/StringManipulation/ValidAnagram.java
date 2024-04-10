package March24.StringManipulation;

// todo : https://leetcode.com/problems/valid-anagram/description/

public class ValidAnagram {
    public static boolean anagram(String s1, String s2) {

        if(s1.length() != s2.length()) {
            return false;
        }
        int[] freq = new int[26];

        for(int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a'] += 1;
        }
        for(int i = 0; i < s2.length(); i++) {
            freq[s1.charAt(i) - 'a'] -= 1;
        }

        for (int i:freq) {
            if(i != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagarm";
        System.out.println(anagram(s1, s2));
    }
}
