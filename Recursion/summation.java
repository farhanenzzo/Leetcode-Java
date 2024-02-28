package Recursion;

public class summation {
    public static void printSum(int startNum, int n, int sum) {
        if (startNum == n) {
            sum += startNum;
            System.out.println(sum);
            return;
        }

        sum += startNum;
        printSum(startNum + 1, n, sum);
    }

    public static void main(String[] args) {
        int sum = 0;
        printSum(1, 5, sum);
    }
}
