package January24;

public class DigitSum {
    public static void main(String[] args) {
        String str = "A2B6W90B1";
        int sum = 0;

        for(char ch: str.toCharArray()) {
            if(Character.isDigit(ch)) {
                sum += Integer.parseInt(ch + "");
            }
        }
        System.out.println(sum);
    }
}
