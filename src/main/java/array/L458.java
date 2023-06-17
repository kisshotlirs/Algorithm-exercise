package array;

import java.util.Arrays;

/**
 * @author: zyl
 * @description: 最大连续1的个数
 */
public class L458 {

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(new L458().findMaxConsecutiveOnes(nums));
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0, count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        maxCount = Math.max(maxCount, count);
        return maxCount;
    }
}
