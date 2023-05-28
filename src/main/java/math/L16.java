package math;

import java.util.Arrays;

/**
 * @author: zyl
 * @description: 最接近的三数之和
 */
public class L16 {

    public static void main(String[] args) {

    }

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closeSum = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i+1;
            int right = nums.length-1;
            while (left < right){
                int curSum = nums[i]+nums[left]+nums[right];
                if (Math.abs(curSum-target) < Math.abs(closeSum-target)){
                    closeSum = curSum;
                }
                if (curSum < target){
                    left++;
                } else if (curSum > target) {
                    right--;
                } else {
                    return curSum;
                }
            }
        }
        return closeSum;
    }
}
