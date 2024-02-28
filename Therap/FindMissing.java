package Therap;

// todo: Given (n-1) unique integers, ranging from 1 to n. Write a method to find the missing integer.
public class FindMissing {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2,1,4,5};

        int givenTotal = 0;
        int total = 0;

        for(int i = 1; i<= n; i++) {
            total +=i;
        }
        for (int j : arr) {
            givenTotal += j;
        }
        System.out.println("Missing number: " + (total - givenTotal));
    }
}
