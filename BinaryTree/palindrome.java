package BinaryTree;

public class palindrome {
    public static String rev(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0;  i--) {
            rev += s.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        String palindromeStr = "A man, a plan, a canal, Panama";
        String con = palindromeStr.toLowerCase().replace(",", "").replace(" ", "");
        System.out.println(con);
        String palindrome = rev(con);
        if(palindrome.equals(con)) {
            System.out.println("palindrome");
        } else {
            System.out.println("NO");
        }
    }
}
