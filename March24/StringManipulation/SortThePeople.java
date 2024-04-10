package March24.StringManipulation;
// todo: https://leetcode.com/problems/sort-the-people/description/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortThePeople {
    public static void main(String[] args) {
        int[] height = {180,165,170};
        String[] name = {"Mary","John","Emma"};
        Map<Integer, String> map = new HashMap<>();

        for(int i = 0; i < height.length; i++) {
            map.put(height[i], name[i]);
        }
        Arrays.sort(height);
        String [] result = new String[name.length];

        int resultIdx = 0;
        for(int i = height.length - 1 ; i >= 0; i--) {
            result[resultIdx] = map.get(height[i]);
            resultIdx++;
        }
        System.out.println(Arrays.toString(result));
    }
}
