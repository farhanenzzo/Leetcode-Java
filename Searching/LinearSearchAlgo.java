package Searching;

public class LinearSearchAlgo {
    public static void main(String[] args) {
        int[] arr = {1,4,2,6,7};
        int target = 7;
        System.out.println(LinSearch(arr, target));

    }

    private static int LinSearch(int[] arr, int target) {

        for(int idx = 0; idx < arr.length; idx++) {
            if(arr[idx] == target) {
                return idx;
            }
        }
        return -1;
    }
}
