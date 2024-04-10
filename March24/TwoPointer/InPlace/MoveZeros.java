package March24.TwoPointer.InPlace;

import java.util.Arrays;

public class MoveZeros {
    public static void move(int[] arr) {
        int slowP = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[slowP];
                arr[slowP] = temp;
                slowP++;
            }
        }
        while (slowP < arr.length) {
            arr[slowP] = 0;
            slowP++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        move(arr);
        System.out.println(Arrays.toString(arr));
    }
}
