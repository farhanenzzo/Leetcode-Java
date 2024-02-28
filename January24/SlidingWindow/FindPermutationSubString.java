package January24.SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindPermutationSubString {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "cba";

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(int i = 0; i < s1.length(); i++) {
            arr1[s1.charAt(i)-'a']++;
            arr2[s2.charAt(i)-'a']++;
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        for(int i = 0; i < s2.length() - s1.length(); i++) {
            if(isValid(arr1, arr2)) {
                System.out.println("Yess");
            }else {
                arr2[s2.charAt(i)-'a']--;
                arr2[s2.charAt(i+s1.length())-'a']++; // sliding forward
            }
        }
        if(isValid(arr1, arr2)){
            System.out.println("Yesssss");
        }

        System.out.println(Arrays.toString(arr2));
    }

    public static boolean isValid(int[] arr1, int[] arr2) {
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

}
