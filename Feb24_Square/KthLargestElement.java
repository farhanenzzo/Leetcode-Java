package Feb24_Square;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] arr = {2,1,4,6,3,5};
        int kth = 2;

        Queue<Integer> minHeap = new PriorityQueue<>(); // sort element in asc order, works like stack(LIFO)
        for(int i: arr) {
            minHeap.add(i);    // offer()
        }

        int len = arr.length;
        while (len > kth) {
            minHeap.remove();   // poll()
            len--;
        }
        System.out.println(minHeap.peek());
    }
}

/*
 while (!minHeap.isEmpty()){
    System.out.println(minHeap.remove());
}
 */