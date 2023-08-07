package array;

import java.util.Arrays;

/**
 * @author mojo
 * @description: 寻找数组的中心下标
 * @date 2023/8/7 0007 21:01
 */
public class L724 {

    public int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (2*sum+nums[i] == total) {
                return i;
            }
            sum = sum+nums[i];
        }
        return -1;
    }
}
