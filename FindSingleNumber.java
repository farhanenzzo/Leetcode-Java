import java.util.HashMap;
import java.util.Map;

//todo: https://leetcode.com/problems/single-number/description/

public class FindSingleNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3};
        System.out.println(singleNumber(arr));

    }

    public static int singleNumber(int[] arr) {

        int unique = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int j : arr) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }

        }

        for(Map.Entry<Integer,Integer> i : map.entrySet()) {
            if(i.getValue() == 1) {
                unique = i.getKey();
                break;
            }
        }
        return unique;
    }
}
