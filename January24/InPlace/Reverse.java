package January24.InPlace;

import java.util.Arrays;

public class Reverse {
    public static void inPlaceRev(int[] arr) {
        int startPointer = 0;
        int endPointer = arr.length - 1;

        while (startPointer < endPointer) {
            int temp = arr[startPointer];
            arr[startPointer] = arr[endPointer];
            arr[endPointer] = temp;
            startPointer++;
            endPointer--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        inPlaceRev(arr);
        System.out.println(Arrays.toString(arr));
    }
}
