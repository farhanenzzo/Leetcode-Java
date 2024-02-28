package Sorting;

public class Merge {
    public static void main(String[] args) {
        int[] unsortedArr = {4,6,2,3,7};
        int start = 0;
        int end = unsortedArr.length - 1;
        divide(unsortedArr, start, end);

        for(int sorted:unsortedArr) {
            System.out.println(sorted);
        }
    }

    private static void divide(int[] unsortedArr, int start, int end) {
        if(start >= end) return; // base case

        int mid = start + (end - start) / 2;
        divide(unsortedArr, start, mid); //left portion
        divide(unsortedArr, mid + 1, end); // right portion
        conquer(unsortedArr, start, mid, end);
    }

    private static void conquer(int[] unsortedArr, int start, int mid, int end) {
        int[] merging = new int[end - start + 1];

        int idxLeftArr = start;
        int idxRightArr = mid + 1;
        int mergeIdx = 0;

        while (idxLeftArr <= mid && idxRightArr <= end) {
            if(unsortedArr[idxLeftArr] <= unsortedArr[idxRightArr]) {
                merging[mergeIdx] = unsortedArr[idxLeftArr];
                mergeIdx++;
                idxLeftArr++;
            }
            else {
                merging[mergeIdx++] = unsortedArr[idxRightArr++];

            }
        }
        while (idxLeftArr <= mid) {
            merging[mergeIdx++] = unsortedArr[idxLeftArr++];

        }
        while (idxRightArr <= end) {
            merging[mergeIdx++] = unsortedArr[idxRightArr++];

        }

        for(int i = 0, j = start; i < merging.length; i++, j++) {
            unsortedArr[j] = merging[i];
        }
    }
}
