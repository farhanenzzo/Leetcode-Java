package Dec_Therap;

public class BinarySearch {
    public static boolean isFound(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high)/2;

            if(arr[mid] == target) {
                return true;
            }
            else if(target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        boolean ans = isFound(arr, 5);
        System.out.println(ans);
    }
}