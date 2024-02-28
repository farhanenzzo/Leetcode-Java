import java.util.Arrays;

public class FindDuplicateOccurrence {

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,4,5};
        int target = 3;

        int leftmost = BinarySearch(arr, target, true);
        int rightmost = BinarySearch(arr, target, false);
        int[] occurrence = {leftmost, rightmost};
        System.out.println(Arrays.toString(occurrence));
    }

    public static int BinarySearch(int[] arr, int target, boolean leftmost) {

        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while(low <= high) {
            int mid = (low + high) / 2;

            if(target == arr[mid]) {
                result = mid;
                if(leftmost) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
}
