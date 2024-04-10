package March24.StringManipulation;

// todo: https://leetcode.com/problems/maximum-odd-binary-number/description/
// todo: https://www.youtube.com/watch?v=uMT--pttmnE

public class MaximumOddBinary {
    public static void main(String[] args) {
        String binary = "101100";
        StringBuilder stringBuilder = new StringBuilder();
        int countOne = 0;

        for(int i = 0; i < binary.length(); i++ ) {
            if(binary.charAt(i) == '1') {
                countOne++;
            }
        }

        for(int i = 1; i < countOne; i++) {
            stringBuilder.append(1);
        }
        for(int i = countOne; i < binary.length(); i++) {
            stringBuilder.append(0);
        }
        stringBuilder.append(1);
        System.out.println(stringBuilder.toString());
    }
}
