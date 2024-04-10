package March24.TwoPointer.InPlace;

import java.util.Arrays;

public class MoveZerosAndOnes {
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,1,0,1};

        int slowP = 0;
        int endP = arr.length - 1;
        for(int fastP = 0; fastP < arr.length; fastP++) {
            if(arr[fastP] == 0) {
                arr[slowP] = arr[fastP];
                slowP++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
