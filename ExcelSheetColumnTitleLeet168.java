public class ExcelSheetColumnTitleLeet168 {
    public static void main(String[] args) {
        int colNum = 28;
        System.out.println(getColumnName(colNum));
    }

    private static String getColumnName(int colNum) {
        String ans = "";
        while (colNum > 0) {
            colNum--;
            int mod = colNum % 26;
            char typeCast = (char) ('A' + mod);
            ans = typeCast + ans;
            colNum = colNum / 26;
        }
        return ans;
    }
}




//            ans = (char)('A'+(colNum % 26)) + ans;
// we are getting char from the right most
// and putting the value in ans = current + ans
//  (char) is for conversion in ASCII
// In ASCII, char 'A' = 65
//

/*
 * assuming 0 - A
 * 1 - B
 */


/* in exel
 * 1 - A
 * 2 - B
 */
