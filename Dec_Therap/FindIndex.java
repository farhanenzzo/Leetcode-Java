package Dec_Therap;

public class FindIndex {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,5,4};
//        int[] arr = {3,1,2,4,5};
//        int[] arr = {1,3,2,4,5};
        int[] arr = {1,3,4,2,5};


        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] + 1 != arr[i+1]) {
                if (arr[i] < arr[i+1]) {
                    System.out.println(i+1);
                } else {
                    System.out.println(i);
                }
                break;
            }
        }
    }
}
