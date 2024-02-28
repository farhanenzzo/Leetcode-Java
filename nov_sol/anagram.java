package nov_sol;

public class anagram {
    public static String IsAnagram(String s) {

        char[] arr = s.toCharArray();
        char temp;
        String str = "";

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++ ) {
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (char c: arr) {
            str += c;
        }
        return str;
    }

    public static void main(String[] args) {
        String test1 = "anagram";
        String test2 = "nagaram";

        if (IsAnagram(test1).equals(IsAnagram(test2))) {
            System.out.println("Anagram");
        } else {
            System.out.println("No");
        }
    }
}
