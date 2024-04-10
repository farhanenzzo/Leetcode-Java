package March24.TwoPointer.InPlace;

import java.util.Arrays;

// todo: https://leetcode.ca/2015-12-26-26-Remove-Duplicates-from-Sorted-Array/

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] arr) {
        int k = 0;
        for (int x : arr) {
            if (k == 0 || x != arr[k - 1]) {
                arr[k] = x;
                k++;
            }
        }
        return k;
    }

    public static int removeDuplicate(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int uniqueCount = 1; // At least one unique element ,, slow pointer

        for (int i = 0; i < arr.length - 1; i++) {  // i -> fast pointer
            if (arr[i] != arr[i + 1]) {
                arr[uniqueCount] = arr[i+1];
                uniqueCount++;
            }
        }

        return uniqueCount;
    }
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2};
        System.out.println(removeDuplicate(arr));
        System.out.println(Arrays.toString(arr));
    }
}
