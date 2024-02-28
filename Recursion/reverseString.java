package Recursion;

public class reverseString {

    public static String revLoop(String s) {
        StringBuilder rev = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i --) {
            rev.append(s.charAt(i));
        }
        return rev.toString();
    }

    public static void revRecursion(int idx, String s) {
        if(idx == 0) {
            System.out.println(s.charAt(idx));
            return;
        }
        System.out.println(s.charAt(idx));
        revRecursion(idx - 1, s);
    }
    public static void main(String[] args) {
        String s = "abcd";

        System.out.println(revLoop(s));

        // time complexity -> O(n)
        revRecursion(s.length() - 1, s);  // length 4 means last index is 3
    }
}


