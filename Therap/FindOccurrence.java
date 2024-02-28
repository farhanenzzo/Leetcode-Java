package Therap;

import java.util.HashMap;
import java.util.Map;

public class FindOccurrence {
    public static void method1(String str) {
        Map<Character, Integer> charOccurrences = new HashMap<>();

        for (char c : str.toCharArray()) {
            if(charOccurrences.get(c) == null) {
                charOccurrences.put(c, 1);
            } else {
                charOccurrences.put(c, charOccurrences.get(c) + 1);
            }
        }
        System.out.println(charOccurrences);
    }

    public static void method2(String str) {
        Map<Character, Integer> charOccurrences = new HashMap<>();

        for (char c : str.toCharArray()) {
            charOccurrences.put(c, charOccurrences.getOrDefault(c, 0) + 1);
        }

        System.out.println(charOccurrences);
    }

    public static void main(String[] args) {
        String s = "farhan ahmed";
        String replaced_space = s.replace(" ", "");
        method1(replaced_space);
        method2(replaced_space);
    }
}
