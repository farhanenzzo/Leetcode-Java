package March24.DynamicApproach;

import java.util.HashMap;
import java.util.Map;

public class FibonacciNumbers {
    public static int withMemoization(int n, Map<Integer, Integer> memo) {
        if (n == 0 || n == 1) {
            return n;
        } else if (memo.containsKey(n)) {
            return memo.get(n);
        } else {
            int result = withMemoization(n - 1, memo) + withMemoization(n - 2, memo);
            memo.put(n, result);
            System.out.println(memo);
            return result;
        }
    }
    public static void main(String[] args) {
        int fib = 5;
        Map<Integer, Integer> memo = new HashMap<>();
        int result = withMemoization(fib, memo);
        System.out.println("F(" + fib + ") = " + result);
    }
}
