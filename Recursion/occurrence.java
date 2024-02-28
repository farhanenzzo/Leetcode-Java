package Recursion;

//find the first and last occurrence of an element in a string

public class occurrence {

    public static int firstIdx = -1;  // when initializing a empty variable try to initial it with a invalid value
    public static int lastIdx = -1;

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        char targetElement = 'a';

        findOccurrence(str, targetElement, 0);

    }

    public static void findOccurrence(String str, char targetElement, int idx) {

        if (idx == str.length()) {
            System.out.println(firstIdx);
            System.out.println(lastIdx);
            return;
        }

        char currentChar = str.charAt(idx);

        if (currentChar == targetElement) {
            if (firstIdx == -1) {
                firstIdx = idx;
            } else {
                lastIdx = idx;
            }
        }

        findOccurrence(str, targetElement, idx + 1);
    }
}
