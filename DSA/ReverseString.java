package DSA;

public class ReverseString {
    public static void main(String[] args) {
        String str = "farhanahmed";
        int revChars = 2;
        char[] arr = str.toCharArray();

        for(int i = 0; i < arr.length; i = i + 2*revChars) {
            int start = i;
            int end = Math.min(i + revChars, arr.length) - 1;

            while (start < end) {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        String rev = new String(arr);
        System.out.println(rev);
    }
}
