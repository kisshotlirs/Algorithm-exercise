package array;

import java.util.Arrays;

/**
 * @author mojo
 * @description: 数组拆分
 * @date 2023/7/11 0011 20:37
 */
public class L561 {

    public static void main(String[] args) {

    }

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length; i=i+2) {
            count = count+nums[i];
        }
        return count;
    }
}
