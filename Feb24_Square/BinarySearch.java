package Feb24_Square;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 7;

        int low = 0;
        int high = arr.length - 1;

        int loop = 0;
        while (low < high) {
            loop++;
            int mid = (low + high) / 2;

            if(target == arr[mid]) {
                System.out.println(arr[mid]);
                break;
            } else if (target > arr[mid]) {
                low = mid;
            } else {
                high = mid;
            }
        }
        System.out.println(loop);
    }
}
