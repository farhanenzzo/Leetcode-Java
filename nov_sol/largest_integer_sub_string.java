package nov_sol;

public class largest_integer_sub_string {
    public static void main(String[] args) {
        String str = "67558";
        String sub = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if(c % 2 != 0) {
                sub = str.substring(0, i+1);
                break;
            }

        }
        System.out.println(sub);
    }
}
