package nov_sol;

import java.util.ArrayList;
import java.util.List;

public class string_summation {
    public static void main(String[] args) {
        String firstWord = "acb";
        String secondWord = "cba";
        String targetWord = "cdb";


        String f = "";
        String s = "";
        String t = "";

        for(int i = 0; i < firstWord.length(); i++) {
            f += firstWord.charAt(i) - 'a';
        }
        for(int i = 0; i < secondWord.length(); i++) {
            s += secondWord.charAt(i) - 'a';
        }
        for(int i = 0; i < targetWord.length(); i++) {
            t += targetWord.charAt(i) - 'a';
        }
        if(Integer.parseInt(f) + Integer.parseInt(s) == Integer.parseInt(t)) {
            System.out.println("true");

        } else {
            System.out.println("false");
        }
    }
}
