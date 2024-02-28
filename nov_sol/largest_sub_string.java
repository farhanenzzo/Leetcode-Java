package nov_sol;

public class largest_sub_string {
    public static int bruteForce(String str) {
        int largest = -1;
        for(int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    largest = Math.max(largest, j - i - 1);
                }
            }
        }
        return largest;
    }
    public static int maxLengthBetweenEqualCharacters(String s) {

        int[] arr = new int [26];
        int max = -1;

        for(int i = 0; i < s.length(); i++){
            int idx = s.charAt(i) - 'a';
            if( arr[idx] > 0){
                max = Math.max(max, i - arr[idx]);
            }else{
                arr[idx] = i + 1;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String str = "farhan";
        System.out.println(bruteForce(str));
        System.out.println(maxLengthBetweenEqualCharacters(str));
    }
}
