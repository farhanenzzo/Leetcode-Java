public class GetMaxSumSubArray {
    public static void main(String[] args) {
        int windowSize = 2;
        int[] arr = {1, 6, 3, 4, 5, 4, 7};

        int windowSum = 0;
        int maxSum = 0;

        for(int i = 0; i < windowSize; i++) {
            windowSum += arr[i];
        }

        for(int slide = windowSize; slide < arr.length; slide++) {
            windowSum += arr[slide] - arr[slide - windowSize];
            maxSum = Math.max(maxSum, windowSum);
        }

        System.out.println(maxSum);


    }
}
