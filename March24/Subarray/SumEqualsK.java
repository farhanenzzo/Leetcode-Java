package March24.Subarray;

import java.util.HashMap;
import java.util.Map;

// todo: https://leetcode.ca/2016-10-20-325-Maximum-Size-Subarray-Sum-Equals-k/
// todo : https://leetcode.com/problems/subarray-sum-equals-k/
public class SumEqualsK {
    public static int maxSubArrayLen(int[] num, int k) {
        Map<Long, Integer> map = new HashMap<>();
        map.put(0L, -1);
        System.out.println(map);
        int ans = 0;
        long s = 0;

        for (int i = 0; i < num.length; ++i) {
            s += num[i];
            System.out.println("i = " + i + " | s = " + s);
            ans = Math.max(ans, i - map.getOrDefault(s - k, i));
            System.out.println("ans after max = " + ans);
            map.putIfAbsent(s, i);
            System.out.println("map : " + map);
            System.out.println("------------------");
        }
        return ans;
    }

    public static int maxiSubArrayLen(int[] nums, int k) {
        int max = 0;
        Map<Integer, Integer> sums = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i ++) {
            sum += nums[i];
            if (sum == k) {
                max = Math.max(max, i + 1);
            }
            if (!sums.containsKey(sum)) {
                sums.put(sum, i);
            }
            if (sums.containsKey(sum - k)) {
                max = Math.max(max, i - sums.get(sum - k));
            }

        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {-2, -1, 2, 1};
        int k = 1;
        int result = maxSubArrayLen(arr, k);
        System.out.println(result);

        System.out.println(maxiSubArrayLen(arr, k));


    }
}

// todo: https://cheonhyangzhang.gitbooks.io/leetcode-solutions/content/325-maximum-size-subarray-sum-equals-k.html
// todo: https://tenderleo.gitbooks.io/leetcode-solutions-/content/GoogleMedium/325.html