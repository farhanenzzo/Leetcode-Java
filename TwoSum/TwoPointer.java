package TwoSum;

// todo: it is applicable only for sorted array

import java.util.Arrays;

public class TwoPointer {
    public static void main(String[] args) {
        int[] sortedArr = {1, 2, 3, 5, 6};
        int target = 9;
        Arrays.sort(sortedArr);

        int startPointer = 0;
        int endPointer = sortedArr.length -1;

        while (startPointer < endPointer) {
            if(sortedArr[startPointer] + sortedArr[endPointer] ==  target) {
                System.out.println(startPointer);
                System.out.println(endPointer);
                break;
            }
            else if(sortedArr[startPointer] + sortedArr[endPointer] > target) {
                endPointer--;
            } else {
                startPointer++;
            }
        }


    }
}
