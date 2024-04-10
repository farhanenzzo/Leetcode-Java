package VJudge;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            int stalls = scanner.nextInt();
            int cows = scanner.nextInt();

            if (cows > stalls) {
                System.out.println("Invalid input: Cows cannot be more than stalls");
                continue;
            }

            int[] stallPositions = new int[stalls];
            for (int j = 0; j < stalls; j++) {
                stallPositions[j] = scanner.nextInt();
            }

            Arrays.sort(stallPositions);

            int minDistance = findLargestMinDistance(stallPositions, cows);
            System.out.println(minDistance);
        }

        scanner.close();
    }

    public static int findLargestMinDistance(int[] stallPositions, int cows) {
        long low = 1;
        long high = stallPositions[stallPositions.length - 1] - stallPositions[0]; // Maximum possible distance

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (canPlaceCows(stallPositions, cows, mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return (int) high;
    }

    public static boolean canPlaceCows(int[] stallPositions, int cows, long minDistance) {
        int lastPlacedCow = stallPositions[0];
        int cowsPlaced = 1;

        for (int i = 1; i < stallPositions.length; i++) {
            if (stallPositions[i] - lastPlacedCow >= minDistance) {
                cowsPlaced++;
                lastPlacedCow = stallPositions[i];
            }
        }

        return cowsPlaced >= cows;
    }
}
