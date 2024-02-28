package Therap;

public class FindIndex {
    public static void main(String[] args) {
        int[] num = {1, 2, 4, 3, 5};
        System.out.println("Approach1: " + approach1(num));
        System.out.println("Approach2: " + approach2(num));
        System.out.println("Approach3: " + approach3(num));

    }

    public static int approach1(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]) { // [i + 1] is the reason for (arr.length -1)
                return i;
            }
        }
        return -1;
    }

    public static int approach2(int[] arr) {
        for(int i = 0; i < arr.length/2 - 1 ; i++) {
            if(arr[i] > arr[i+1]) {
                return i;
            }
        }

        for(int i = arr.length/2; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                return i;
            }
        }
        return -1;
    }

    public static int approach3(int[] arr) {
        for(int i = 0; i < arr.length/2; i++) {
            if(arr[i] > arr[i+1]) {
                return i;
            }
        }

        for(int i = arr.length/2 + 1; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                return i;
            }
        }
        return arr.length/2;
    }
}
