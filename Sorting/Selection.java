package Sorting;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {2,4,5,1,3};

        runSort(arr);

        for(int num: arr) {
            System.out.println(num);
        }
    }

    private static void runSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            // swapping
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
    }

}
