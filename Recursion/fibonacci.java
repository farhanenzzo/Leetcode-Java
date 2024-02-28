package Recursion;

public class fibonacci {
    public static void printFib(int a, int b, int nth) {
        if(nth == 0) {
            return;
        }

        int nextNum = a + b;
        System.out.println(nextNum);
        printFib(b, nextNum, nth - 1); // here, b becomes new -> a and nextNum becomes new -> b

    }

    public static void main(String[] args) {
        int first_num = 0;
        int second_num = 1;
        System.out.println(first_num);
        System.out.println(second_num);

        int nth = 7;
        printFib(first_num, second_num, nth - 2); // (nth - 2) -> we already have printed first two num

    }
}
