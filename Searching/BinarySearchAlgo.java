package Searching;

public class BinarySearchAlgo {
    public static void main(String[] args) {
        int[] num = {2, 12, 15,16, 17};
        int target = 16;
        System.out.println(search(num, target));
    }

    static int search(int[] num, int target) {
        int start = 0;
        int end = num.length - 1;

        while (start <= end) {
            int mid = (end + start) / 2;

            if (target < num[mid])
                end = mid - 1;
            else if (target > num[mid])
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}
