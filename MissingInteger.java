// todo: https://leetcode.com/problems/missing-number/description/

public class MissingInteger {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6};
        int[] given = {1, 2, 3, 0, 5, 6};
        int arraySize = array.length + 1;

        System.out.println(findMissingInteger(array, arraySize));
        System.out.println(missingNumber(given));

    }

    private static int findMissingInteger(int[] array, int arraySize) {

        int totalSum = (arraySize * (arraySize + 1)) / 2;

        int givenArrTotal = 0;
        for(int num: array) {
            givenArrTotal += num;
        }
        return totalSum - givenArrTotal;
    }

    private static int missingNumber(int[] arr) {
        int size = arr.length;
        int total = 0;
        int actualTotal = 0;

        for(int i = 1; i <= size; i++) {
            actualTotal += i;
        }
        for(int i : arr) {
            total += i;
        }

        return actualTotal - total;
    }
}
