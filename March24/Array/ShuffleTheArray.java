package March24.Array;

import java.util.Arrays;

public class ShuffleTheArray {
    public static int[] shuffle(int[] arr, int size) {
        int[] shuffle = new int[size*2];

        int j = 0;
        for(int i = 0; i < size; i++) {
            shuffle[j] = arr[i];
            j++;
            shuffle[j] = arr[i+size];
            j++;
        }
        return shuffle;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2};
        int size = 2;
        System.out.println(Arrays.toString(shuffle(arr, size)));
    }
}
