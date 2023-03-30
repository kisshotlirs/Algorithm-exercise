package array;

import java.util.Arrays;

/**
 * @author: zyl
 * @description: 三个数的最大乘积
 */
public class L628 {
}

class Solution628 {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int max1 = nums[n-1]*nums[n-2]*nums[n-3];
        int max2 = nums[0] * nums[1] * nums[n - 1];
        return Math.max(max2,max1);
    }
}