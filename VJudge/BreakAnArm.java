package VJudge;

import java.util.Scanner;

public class BreakAnArm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int testCase = 1; testCase <= T; testCase++) {
            double AB, AC, BC, areaRatio;

            try {
                AB = scanner.nextDouble();
                AC = scanner.nextDouble();
                BC = scanner.nextDouble();
                areaRatio = scanner.nextDouble();

                // Validate input (all sides must be positive)
                if (AB <= 0 || AC <= 0 || BC <= 0) {
                    throw new IllegalArgumentException("Invalid input: All sides must be positive values.");
                }

                // Since AD = BC based on our derivation
                double AD = BC;

                System.out.printf("Case %d: %.10f\n", testCase, AD);
            } catch (IllegalArgumentException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
