import java.util.*;

public class FindVowels {
    public static void main(String[] args) {
        String randomStr = "Farhan";
        String convertRandomStr = randomStr.toLowerCase();
        int counter = 0;
        char[] vowel = new char[5];
        Set<Character> set = new HashSet<>();
        List<Character> list = new ArrayList<>();

        for(int i = 0; i < convertRandomStr.length(); i++) {
           if(convertRandomStr.charAt(i) == 'a' || convertRandomStr.charAt(i) == 'e' || convertRandomStr.charAt(i) == 'i' || convertRandomStr.charAt(i) == 'o' ||
           convertRandomStr.charAt(i) == 'u') {
               vowel[i] =    convertRandomStr.charAt(i);
               set.add(convertRandomStr.charAt(i));
               list.add(convertRandomStr.charAt(i));
               counter += 1;
           }
        }

        System.out.println(counter);
        System.out.println("With list: " + list);
        System.out.println("With Set: " + set);
        System.out.println("With Array: " + Arrays.toString(vowel));
    }
}
