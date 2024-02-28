public class SecondHighestDigit {
    public static void main(String[] args) {
        String s = "sj8344";
        int first = -1;
        int sec = -1;

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int d = c - '0';
                if (first < d) {
                    sec = first;
                    first = d;
                } else if (sec < d && d < first) {
                    sec = d;
                }
            }
        }

        System.out.println(sec);
    }
}
