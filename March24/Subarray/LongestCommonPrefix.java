package March24.Subarray;

import java.util.HashSet;
import java.util.Set;

// todo : https://leetcode.ca/2024-02-23-3043-Find-the-Length-of-the-Longest-Common-Prefix/
public class LongestCommonPrefix {

    public static int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int x : arr1) {
            System.out.println("-----");
            while(x > 0) {
                set.add(x);
                System.out.println("current set : " + set);
                x /= 10;
                System.out.println("value of x : " + x);
            }
        }
        int ans = 0;
        for (int x : arr2) {
            while(x > 0) {
                if (set.contains(x)) {
                    ans = Math.max(ans, String.valueOf(x).length());
                    break;
                }
                x /= 10;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,100};
        int[] arr2 = {1000};
        int result = longestCommonPrefix(arr1, arr2);
        System.out.println(result);

    }
}
