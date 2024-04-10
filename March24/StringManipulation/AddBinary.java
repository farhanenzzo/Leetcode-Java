package March24.StringManipulation;
// todo : https://leetcode.com/problems/add-binary/description/
// todo : https://www.youtube.com/watch?v=OEW50g03mT0&t=7s

public class AddBinary {
    public static String getBinarySum(String a, String b) {
        StringBuilder stringBuilder = new StringBuilder();

        int carry = 0;
        int aLen = a.length() - 1;
        int bLen = b.length() - 1;

        while (aLen >= 0 || bLen >= 0) {
            int binSum = carry;
            if(aLen >= 0) {
                binSum += a.charAt(aLen) - '0';
                System.out.println("a sum : " + binSum);
            }
            if(bLen >= 0) {
                binSum += b.charAt(bLen) - '0';
                System.out.println("b sum : " + binSum);
            }
            stringBuilder.append(binSum % 2);
            carry = binSum / 2;

            aLen--;
            bLen--;

        }
        if (carry != 0) {
            stringBuilder.append(carry);
        }
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(getBinarySum(a,b));
    }
}
