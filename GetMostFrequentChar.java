import java.util.HashMap;
import java.util.Map;

public class GetMostFrequentChar {
    public static char findMostFrequentCharacter(String str) {
        Map<Character, Integer> charOccurrences = new HashMap<>();
        String replaced = str.replace(" ", "");

        for (char c : replaced.toCharArray()) {
            if(charOccurrences.get(c) == null) {
                charOccurrences.put(c, 1);
            } else {
                charOccurrences.put(c, charOccurrences.get(c) + 1);
            }
        }

        char mostFrequent = ' ';
        int maxOccurrences = 0;

        System.out.println("entry set: " + charOccurrences.entrySet());

        for (Map.Entry<Character, Integer> entry : charOccurrences.entrySet()) {

            System.out.println("entry: " + entry);
            System.out.println("get value: "+ entry.getValue());
            System.out.println("get key: "+ entry.getKey());

            int occurrences = entry.getValue();
            if (occurrences > maxOccurrences) {
                mostFrequent = entry.getKey();
                maxOccurrences = occurrences;
            }
        }
        return mostFrequent;
    }

    public static void main(String[] args) {
        String input = "hello worldo oo";
        System.out.println("Most frequent character: " + findMostFrequentCharacter(input));
    }
}