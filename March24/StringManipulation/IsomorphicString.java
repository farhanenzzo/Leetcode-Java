package March24.StringManipulation;
import java.util.HashMap;
import java.util.Map;
// todo: https://www.youtube.com/watch?v=ogTMIFPjNkQ

public class IsomorphicString {
    public static boolean isomorphic(String original, String replacement) {
        Map<Character, Character> map = new HashMap<>();
        for(int i = 0; i < original.length(); i++) {
            char originalChar = original.charAt(i);
            char replaceChar = replacement.charAt(i);

            if(!map.containsKey(originalChar)) {
                if(!map.containsValue(replaceChar)) {
                    map.put(originalChar, replaceChar);
                } else {
                    return false;
                }
            } else {
                char originalKey = map.get(originalChar);
                if(originalKey != replaceChar) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String original = "badc";
        String replacement = "kikp";
        System.out.println(isomorphic(original, replacement));

    }
}
