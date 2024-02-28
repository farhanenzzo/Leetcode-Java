package Sorting;

public class BubbleSort {

    public static void main(String[] args) {
//        int[] arr = {2,4,5,1,3};
        int[] arr = {1,2,3,4,5};


        runSort(arr);
        for(int num: arr) {
            System.out.println(num);
        }
    }

    private static void runSort(int[] arr) {
        boolean flag = false;
        int temp;

        while(!flag) {
            flag = true;
            for(int i = 0; i < arr.length - 1; i++) {
                if(arr[i] > arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = false;
                }
            }
        }
    }
}
