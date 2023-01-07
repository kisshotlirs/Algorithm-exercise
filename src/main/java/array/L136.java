package array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mojo
 * @description: 只出现一次的数字
 * @date 2023/1/7 0007 21:20
 */
public class L136 {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        Solution136 solution136 = new Solution136();
        System.out.println(solution136.singleNumber1(nums));

        System.out.println(solution136.singleNumber(nums));
    }
}

class Solution136 {

    /**
     * 利用 Hash 表，Time: O(n) Space: O(n)
     */
    public int singleNumber1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums) {
            Integer count = map.get(i);
            count = count == null ? 1 : ++count;
            map.put(i, count);
        }
        for (Integer i : map.keySet()) {
            Integer count = map.get(i);
            if (count == 1) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 异或
     */
    public int singleNumber(int[] nums){
        int ans = nums[0];
        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                ans = ans ^ nums[i];
            }
        }
        return ans;

    }
}
