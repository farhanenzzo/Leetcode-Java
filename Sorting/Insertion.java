package Sorting;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {2,4,5,1,3};
        runSort(arr);

        for(int num: arr) {
            System.out.println(num);
        }
    }

    private static void runSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            // at this point we've exited, so j is either -1
            // or it's at the first element where current >= a[j]
            array[j+1] = current;
        }
    }
}
