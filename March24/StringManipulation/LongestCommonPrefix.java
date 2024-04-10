package March24.StringManipulation;
//todo : https://leetcode.com/problems/longest-common-prefix/description/

public class LongestCommonPrefix {
    public static String common(String[] arr) {
        if(arr.length == 0) {
            return "";
        }
        String prefix = arr[0];

        for(int i = 1; i < arr.length; i++) {
            while (arr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flight"};

        System.out.println(common(arr));

    }
}
