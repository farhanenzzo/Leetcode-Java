package March24.StringManipulation;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int len = 0;
        for(int i = s.length() - 1; i >=0; i--) {
            if(s.charAt(i) != ' ') {
                len++;
            } else {
                if(len > 0) {
                    return len;
                }
            }
        }
        return len;
    }
    public static void main(String[] args) {
        String s = "my name is farhan ";
        System.out.println(lengthOfLastWord(s));
    }
}
