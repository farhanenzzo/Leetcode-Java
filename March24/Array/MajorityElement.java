package March24.Array;
// todo: https://leetcode.com/problems/majority-element/description/

public class MajorityElement {

    public static int majority(int[] arr) {
        int count = 0;
        int candidate = 0;

        for(int i:arr) {
            if(count == 0) {
                candidate = i;
                count = 1;
            } else {
                if(candidate == i) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        System.out.println(majority(arr));
    }
}
