package January24.SlidingWindow;

public class MinimumSizeSubArraySum {
    public static int slidingWindow(int[] arr, int targetSum) {
        int sum = 0;
        int start = 0;
        int minSubArraySize = Integer.MAX_VALUE;
        int size = 0;

        for(int i = start; i < arr.length; i++) {
            sum = sum + arr[i];
            size++;

            if(sum >= targetSum) {
                minSubArraySize = Math.min(size, minSubArraySize);
                start++;
                sum = 0;
                size = 0;
                i = start;
            }
        }
        return minSubArraySize;

    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 1, 1, 6, 5};
        int targetSum = 11;
        System.out.println(slidingWindow(arr, targetSum));
    }
}
