package January24.SlidingWindow;

public class MaximumSumSubArray {
    public static int bruteForce(int[] arr, int window) {
        int maxSum = 0;
        for(int i = 0; i <= arr.length - window; i++) {
            int sum = 0;
            for(int j = i; j < window + i; j++) {
                sum = sum + arr[j];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static int slidingWindow(int[] arr, int window) {
        int maxSum = 0;
        int start = 0;
        int sum = 0;

        for(int end = 0; end < arr.length; end++) {
            sum = sum + arr[end];
            if(end >= window - 1) {
                maxSum = Math.max(maxSum, sum);
                sum = sum - arr[start];
                start++;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int window = 3;
        System.out.println(bruteForce(arr, window));
        System.out.println(slidingWindow(arr, window));
    }
}
