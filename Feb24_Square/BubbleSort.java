package Feb24_Square;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,1,2,5,4};

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i:arr) System.out.println(i);
    }
}

/*
after each lap(inner loop) of iterations, 1 element gets sorted at the last index
 */
