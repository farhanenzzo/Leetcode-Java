package PriorityQueue;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {
        int k = 2;
        int[] arr = {3,2,5,1,4};
        System.out.println(findKthLargest(arr, k));
    }

    public static int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
           minHeap.offer(num);
        }
        int size = nums.length;
        while (size > k) {
            minHeap.poll();
            size--;
        }

        // The kth largest element will be at the top of the heap
        return minHeap.peek();
    }

}
