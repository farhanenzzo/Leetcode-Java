package DSA;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] arr = {2,4,1,6,2,4,7};
        linearSearch(arr);


    }

    public static void linearSearch(int[] arr) {
        int size = arr.length;
        int max, min;

        if(size == 1) {
            max = arr[0];
            min = arr[0];
        } else {
            if(arr[0] > arr[1]) {
                max = arr[0];
                min = arr[1];
            } else {
                max = arr[1];
                min = arr[0];
            }
            for(int i = 2; i < size; i++) {
                if(arr[i] > max){
                    max = arr[i];
                } else if (arr[i] < min) {
                    min = arr[i];
                }
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    public static void randomLoop(int[] arr) {

        int max = arr[0];
        int min = arr[0];

        for(int i: arr) {
            if(i > max) {
                max = i;
            } else if (i < min) {
                min = i;
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
