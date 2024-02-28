public class CheckRecord {
    public static boolean checkRecord(String s) {
        int countLate = 1;
        int countAbsent = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            char currentChar = s.charAt(i);
            char nextChar = s.charAt(i + 1);

            if (currentChar == nextChar) {
                if(currentChar == 'L'){
                    countLate++;
                }
            }

            if(s.charAt(i) == 'A'){
                countAbsent++;
            }
        }
        System.out.println("Late: " + countLate);
        System.out.println("Absent: " + countAbsent);

        return countLate > 3 || countAbsent > 2;

    }

    public static void main(String[] args) {
        String given = "PPALLP";
        System.out.println( checkRecord(given));

    }
}
