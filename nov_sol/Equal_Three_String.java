package nov_sol;

public class Equal_Three_String {

    public static int findMinimumOperations(String s1, String s2, String s3) {
        int m = Math.min(s1.length(), s2.length());
        int m2 = Math.min(m, s3.length());
        int i = 0;

        while (i < m2 && s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i)) {
            i++;
        }
        if(i == 0) {
            return -1;
        }
        return (s1.length() + s2.length() + s3.length()) - (i*3);
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abb";
        String s3 = "abc";

        int result = findMinimumOperations(s1,s2,s3);
        System.out.println(result);
    }
}
