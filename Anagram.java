public class Anagram {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "aab";

        System.out.println(isAnagram(s1, s2));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[5];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int j : freq) {
            if (j != 0) {
                return false;
            }
        }

        return true;
    }

//    public static boolean isAnagram(String s1, String s2) {
//        if (s1.length() != s2.length()) {
//            return false;
//        }
//        int count = 0;
//        List<Character> list =new ArrayList<>();
//
//        for (int i =0; i < s1.length(); i++) {
//            for(int j = 0; j < s2.length(); j++) {
//                if(s1.charAt(i) == s2.charAt(j)) {
//                    if(!list.contains(s2.charAt(j))){
//                        list.add(s2.charAt(j));
//                        count +=1;
//                    }
//                }
//            }
//        }
//        return count == 3;
//    }
}
