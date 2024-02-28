package January24;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "heart";
        String s2 = "earth";

        if (Arrays.equals(isAnagram(s1), isAnagram(s2))) {
            System.out.println("Anagram");
        } else {
            System.out.println("No Anagram");
        }

        if (Arrays.equals(bubbleSort(s1), bubbleSort(s2))) {
            System.out.println("Anagram");
        } else {
            System.out.println("No Anagram");
        }
    }

    private static char[] bubbleSort(String s) {
        boolean flag = false;
        char[] chr = s.toCharArray();

        while(!flag) {
            flag = true;
            for(int i = 0; i < chr.length - 1; i++) {
                if(chr[i] > chr[i+1]) {
                    char temp = chr[i];
                    chr[i] = chr[i+1];
                    chr[i+1] = temp;
                    flag = false;
                }
            }
        }
        return chr;
    }

    public static char[] isAnagram(String str) {
        char[] chr = str.toCharArray();
        Arrays.sort(chr);
        return chr;
    }
}
