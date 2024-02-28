package Therap;

//todo: [1, 2, 3, 1, 3, 5, 5, 6, 1]
//todo: Given an array of integers, find out the first non-repeating element.

public class FindFirstNonRepeatElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 3, 5, 5, 6, 1};

        for(int target = 0; target < arr.length; target++) {
            int j;
            for(j=0; j < arr.length; j++) {
                if(target != j && arr[target] == arr[j]) {
                    break;
                }
            }
            if(j == arr.length) {
                System.out.println(arr[target]);
                break;
            }
        }
    }
}
