package VJudge;

import java.util.Scanner;

public class Determination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            int days = scanner.nextInt();
            String tasks = scanner.next();

            System.out.println(isTeacherSuspicious(tasks) ? "NO" : "YES");
        }

        scanner.close();
    }

    private static boolean isTeacherSuspicious(String tasks) {
        char currentTask = tasks.charAt(0);
        for (int i = 1; i < tasks.length(); i++) {
            char nextTask = tasks.charAt(i);
            if (nextTask == currentTask) {
                continue;
            }
            if (tasks.indexOf(currentTask, i) != -1) {
                return true;
            }
            currentTask = nextTask;
        }
        return false;
    }
}
