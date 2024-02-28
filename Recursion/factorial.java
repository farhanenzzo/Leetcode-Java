package Recursion;

public class factorial {
    public static int calcFac(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fac_nm1 = calcFac(n -1);
        return n * fac_nm1; // n! = n * (n-1)
    }

    public static void main(String[] args) {
        int n = 5;
        int result = calcFac(n);
        System.out.println(result);
    }
}
