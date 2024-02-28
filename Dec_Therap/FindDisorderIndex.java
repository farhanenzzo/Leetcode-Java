package Dec_Therap;

public class FindDisorderIndex {
    public static void main(String[] args) {
//        int[] asc_array = {1, 3, 4, 2, 5};
        int[] asc_array = {2,4,6,7,9,8};

        String arr = "13425";
        int [] desc_arr = {5, 2, 4, 3, 1};

        int disorderIndex = findDisorderIndex(asc_array);
        System.out.println("Index of the element out of order: " + disorderIndex);

        int pos = findDisorderIndexChar(arr);
        System.out.println(pos);

        int descPos = findDisorderIndexDesc(desc_arr);
        System.out.println(descPos);

    }

    private static int findDisorderIndex(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return i + 1; // Index of the element out of order
            }
        }
        return -1; // If the array is already sorted
    }

    private static int findDisorderIndexDesc(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return i; // Index of the element out of order
            }
        }
        return -1; // If the array is already sorted
    }

    private static int findDisorderIndexChar(String array) {
        char[] arr = array.toCharArray();

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return i + 1; // Index of the element out of order
            }
        }
        return -1; // If the array is already sorted
    }

}

/*

Given an array of integers in ascending order except one, find Index of the element out of order. (int[] arr = {1,3,4,2,5})
-> descending
-> String = “13425”

 */

