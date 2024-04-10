package VJudge;

import java.util.Scanner;

public class GuessTheArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int sum = 0;
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
                sum += a[j];
            }

            int[] b = solve(n, a, sum);
            if (b != null) {
                for (int num : b) {
                    System.out.print(num + " ");
                }
                System.out.println();
            } else {
                System.out.println("No beautiful array found");
            }
        }
        scanner.close();
    }

    private static int[] solve(int n, int[] a, int sum) {
        int[] b = new int[n];

        // Fill b with distinct elements in range [1, n]
        for (int i = 0; i < n; i++) {
            b[i] = i + 1;
        }

        // Greedy approach to minimize absolute difference
        for (int i = 0; i < n; i++) {
            int diff = a[i] - b[i];
            if (diff < 0) {
                continue;
            }

            // Find a suitable element in b to reduce difference
            for (int j = 0; j < n; j++) {
                if (j != i && b[j] > diff && (diff % b[j] == 0 || b[j] % diff == 0)) {
                    b[j] -= diff;
                    break;
                }
            }

            // Difference cannot be reduced with existing elements
            if (diff > 0) {
                return null;
            }
        }

        // Check if sum condition is satisfied
        int newSum = 0;
        for (int i = 0; i < n; i++) {
            newSum += Math.abs(a[i] - b[i]);
        }
        if (newSum <= sum) {
            return b;
        } else {
            return null;
        }
    }
}
