package March24.StringManipulation;
// todo: https://www.youtube.com/watch?v=F34vYRLxna0
// todo : https://leetcode.com/problems/remove-trailing-zeros-from-a-string/description/

public class RemoveTrailingZeros {
    public static void main(String[] args) {
        String num = "2014101500";
        int endPointer = num.length() - 1;
        while (num.charAt(endPointer) == '0') {
            endPointer--;
        }
        System.out.println(num.substring(0, endPointer+1));
    }
}
