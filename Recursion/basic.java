package Recursion;

//print 5 - 0
public class basic {
    public static void printNum(int num) {
        if (num == 0) {
            return;
        }
        printNum(num - 1);
        System.out.println(num);
    }

    public static void main(String[] args) {
        int n = 5;
        printNum(n);
    }
}
