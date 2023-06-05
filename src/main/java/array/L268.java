package array;

import java.util.Arrays;

/**
 * @author: zyl
 * @description: 丢失的数字
 */
public class L268 {

    public static void main(String[] args) {

    }

    public int missingNumber(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            if (nums[i] != i){
                return i;
            }
        }
        return len;
    }
}
