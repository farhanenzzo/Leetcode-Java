package Therap;

// todo: find first non repeating word

public class NonRepeatingWord {
    public static void main(String[] args) {
        String input = "this is a test string with words this is test string with words";
        String[] arr = input.split("\\s+");

        for(int i = 0; i < arr.length; i++) {
            int j;
            for(j = 0; j < arr.length; j++) {
                if(i != j && arr[i].equals(arr[j])) {
                    break;
                }
            }
            if(j == arr.length) {
                System.out.println(arr[i]);
            }
        }
    }
}
