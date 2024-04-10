package March24.Array;

public class FindTheDuplicateNumber {
    public static int findDuplicate(int[] arr) {
        int count = 0;
        int candidate = 0;

        for(int i:arr) {
            System.out.println("------- count: " + count + "--------");
            System.out.println("/////" + i + "////");
            if(count == 0) {
                candidate = i;
                System.out.println("can : " + candidate + " = " + i);
                count = 1;
            } else {
                if(candidate == i) {
                    System.out.println(candidate + " == " + i);
                    count++;
                } else {
                    System.out.println(candidate + "!== " + i);
                    count--;
                }
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        System.out.println(findDuplicate(arr));
    }
}
