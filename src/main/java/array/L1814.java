package array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mojo
 * @description: 统计一个数组中好对子的数目
 * @date 2023/1/17 0017 10:05
 */
public class L1814 {
    public static void main(String[] args) {
        Solution1814 solution1814 = new Solution1814();
        int[] nums = {42,11,1,97};
        System.out.println(solution1814.countNicePairs(nums));
    }
}

class Solution1814 {
    public int countNicePairs(int[] nums) {
        final int MOD = 1000000007;
        int res = 0;
        Map<Integer, Integer> h = new HashMap<Integer, Integer>();
        for (int i : nums) {
            int temp = i, j = 0;
            while (temp > 0) {
                j = j * 10 + temp % 10;
                temp /= 10;
            }
            res = (res + h.getOrDefault(i - j, 0)) % MOD;
            h.put(i - j, h.getOrDefault(i - j, 0) + 1);
        }
        return res;
    }
}