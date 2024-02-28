package Dec_Therap;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatElement {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 3, 5, 5, 6, 1};

        Map<Integer, Integer> charOccurrences = new HashMap<>();

        for (int num : arr) {
            if(charOccurrences.get(num) == null) {
                charOccurrences.put(num, 1);
            } else {
                charOccurrences.put(num, charOccurrences.get(num) + 1);
            }
        }

        for (int num : arr) {
            if (charOccurrences.get(num) == 1) {
                System.out.println(num);
                break;
            }
        }
    }
}
