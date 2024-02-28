public class RemoveDuplicatesFromSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 5, 5};

        int slow = 0;
        for(int fast = 1; fast < arr.length; fast++) {
            if(arr[slow] != arr[fast]) {
                slow++;
                arr[slow] = arr[fast];
            }
        }

        int totalUnique = slow + 1;
        System.out.println(totalUnique);
    }
}
