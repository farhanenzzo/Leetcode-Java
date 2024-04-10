package March24.TwoPointer;
// todo : https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

public class FirstOccurrenceInString {
    public static int findIndex(String haystack, String needle) {
        int needlePointer = 0;

        for(int stackPointer = 0; stackPointer < haystack.length(); stackPointer++) {
            if(haystack.charAt(stackPointer) == needle.charAt(needlePointer)) {
                needlePointer++;

            } else if (haystack.charAt(stackPointer) != needle.charAt(needlePointer)) {
                stackPointer -= needlePointer;
                needlePointer = 0;
            }

            if (needlePointer == needle.length()) {
                return stackPointer - (needlePointer - 1);
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issip";
        System.out.println(findIndex(haystack, needle));
    }
}
