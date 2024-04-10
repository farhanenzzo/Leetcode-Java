package March24.TwoPointer;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsInString {
    public static void main(String[] args) {
        String str = "sasuke";
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int beginP = 0;
        int endP = str.length() - 1;

        char[] arr = str.toCharArray();

        while (beginP < endP) {
            if(!vowels.contains(arr[beginP])) {
                beginP++;
            }
            else if(!vowels.contains(arr[endP])) {
                endP--;
            } else {
                char temp = arr[beginP];
                arr[beginP] = arr[endP];
                arr[endP] = temp;
                beginP++;
                endP--;
            }
        }
        System.out.println(arr);
    }
}
