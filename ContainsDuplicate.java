package ContainsDuplicate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

//todo: https://leetcode.com/problems/contains-duplicate/description/

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1};
        System.out.println(approach1(arr));
        System.out.println(approach2(arr));
        System.out.println(approach3(arr));
    }

    public static boolean approach1(int[] arr) {
        Arrays.sort(arr);

        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1]) {
                return true;
            }
        }
        return false;
    }

    public static boolean approach2(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int j : arr) {
            if (set.contains(j)) {
                return true;
            }
            set.add(j);
        }
        return false;
    }

    public static boolean approach3(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                return true;
            }
            map.put(arr[i], i);
        }
        return false;
    }
}
