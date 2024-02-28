public class FirstNonRepeatingElement {

    public static void main(String[] args) {

        int[] arr = {1,3,2,4,1,2};
        System.out.println("First Non repeat element: " + findFirstNonRepeat(arr));
        System.out.println("First repeat element: " + findFirstRepeat(arr));

    }

    private static int findFirstNonRepeat(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            int j;
            for(j = 0; j < arr.length; j++) {
                if(i != j && arr[i] == arr[j]) {
                    break;
                }
            }
            if (j == arr.length) {
                return arr[i];
            }
        }
        return -1;
    }

    private static int findFirstRepeat(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            int j;
            for(j = 0; j < arr.length; j++) {
                if(i != j && arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
