package March24.TwoPointer;

import java.util.Arrays;

public class TwoSumSorted {
    public static int[] twoSum(int[] arr, int target) {
        int slowP = 0;
        int fastP = arr.length - 1;
        int[] sumIdx = new int[2];

        while (slowP < fastP) {
            if(arr[slowP] + arr[fastP] > target) {
                fastP--;
            } else if (arr[slowP] + arr[fastP] < target) {
                slowP++;
            } else {
                sumIdx[0] = slowP;
                sumIdx[1] = fastP;
                break;
            }
        }
        return sumIdx;
    }
    public static void main(String[] args) {
        int[] sortedArr = {2,3,4,6};
        int target = 7;
        System.out.println(Arrays.toString(twoSum(sortedArr, target)));
    }
}
