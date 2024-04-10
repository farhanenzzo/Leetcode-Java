package March24.StringManipulation;

// todo : https://leetcode.com/problems/remove-all-occurrences-of-a-substring/description/

public class RemoveAllOccurrencesSubstring {
    public static void main(String[] args) {
        String main = "daabcbaabcbc";
        String part = "abc";

        while (main.contains(part)) {
            main = main.replace(part, "");
        }

        System.out.println(main);
    }
}
