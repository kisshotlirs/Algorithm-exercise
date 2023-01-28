package array;

/**
 * @author mojo
 * @description: 连续子数组的最大和 动态规划
 * @date 2023/1/27 0027 16:44
 */
public class L53_O42 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(new Solution53().maxSubArray(nums));
    }
}

class Solution53 {
    public int maxSubArray(int[] nums) {
        if (nums.length==0){
            return 0;
        }

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1]+nums[i] , nums[i]);
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}