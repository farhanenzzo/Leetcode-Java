package March24.StringManipulation;

import java.util.ArrayList;
import java.util.List;

public class WordsContainingChar {
    public static List<Integer> doesContain(String[] arr, char x) {
        List<Integer> lst = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].indexOf(x) != -1) {
                lst.add(i);
            }
        }
        return lst;
    }
    public static void main(String[] args) {
        String[] words = {"feet", "code"};
        char x = 'e';
        System.out.println(doesContain(words, x));
    }
}
