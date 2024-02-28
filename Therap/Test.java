package Therap;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 3, 5, 5, 6, 1};

        // Create an array to store the frequencies of elements
        int[] frequencies = new int[arr.length]; // Assuming the range of elements is limited

        // Iterate through the array to calculate frequencies
        for (int i = 0; i < arr.length; i++) {
            frequencies[arr[i]]++;   // magic line freq increasing index value
        }

        // Find the first non-repeating element
        int firstNonRepeating = -1;

        for (int i = 0; i < arr.length; i++) {
            if (frequencies[arr[i]] == 1) { // ????????????????????????
                firstNonRepeating = arr[i];
                break;
            }
        }

        if (firstNonRepeating != -1) {
            System.out.println("The first non-repeating element is: " + firstNonRepeating);
        } else {
            System.out.println("No non-repeating element found.");
        }
    }
}
