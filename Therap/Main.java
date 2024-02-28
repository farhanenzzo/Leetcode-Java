package Therap;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> combinations = generateCombinations(arr);

        // Print the combinations
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }

    public static List<List<Integer>> generateCombinations(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        generateCombinationsHelper(arr, 0, new ArrayList<>(), result);
        return result;
    }

    private static void generateCombinationsHelper(int[] arr, int index, List<Integer> current, List<List<Integer>> result) {
        if (index == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Include the current element in the combination
        current.add(arr[index]);
        generateCombinationsHelper(arr, index + 1, current, result);
        current.remove(current.size() - 1);

        // Exclude the current element from the combination
        generateCombinationsHelper(arr, index + 1, current, result);
    }
}
