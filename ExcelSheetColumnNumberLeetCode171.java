public class ExcelSheetColumnNumberLeetCode171 {
    public static void main(String[] args) {
        String test = "AB";
        System.out.println(getColumnNumber(test));
    }

    private static int getColumnNumber(String test) {
        int result = 0;
        for(char c : test.toCharArray()){
            int temp = c - 'A' + 1;
            result = result * 26 + temp;
        }
        return result;
    }
}
