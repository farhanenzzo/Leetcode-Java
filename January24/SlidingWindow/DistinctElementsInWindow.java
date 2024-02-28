package January24.SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DistinctElementsInWindow {

    public static List<Integer> countDistinct(int[] arr, int window) {
        List<Integer> count = new ArrayList<>();
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int end = 0; end < arr.length; end++) {
            frequencyMap.put(arr[end], frequencyMap.getOrDefault(arr[end], 0) + 1);

            // Remove the leftmost element from the frequency map
            if (end >= window) {
                if (frequencyMap.get(arr[end - window]) == 1) {
                    frequencyMap.remove(arr[end - window]);
                } else {
                    frequencyMap.put(arr[end - window], frequencyMap.get(arr[end - window]) - 1);
                }
            }

            if (end >= window - 1) {
                count.add(frequencyMap.size());
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] num = {1, 5, 9, 3, 3, 7, 3};
        int k = 3;
        System.out.println(countDistinct(num, k));
    }
}
