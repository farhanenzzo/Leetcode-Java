package Recursion;

// check if an array is sorted. (strictly increasing) -> ex: {1,2,3,4,5}

public class checkingArrayIsSorted {

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        int startIdx = 0;
        boolean funcCall = checkSort(num, startIdx);
        System.out.println(funcCall);

    }

    private static boolean checkSort(int[] num, int startIdx) {;

        if (startIdx == num.length -1 ) {
            return true;
        }

        int currentItem = num[startIdx];
        int nextItem = num[startIdx + 1];

        if(currentItem < nextItem) {
            return checkSort(num, startIdx + 1);
        } else {
            return false;
        }
    }

}
