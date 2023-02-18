package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author mojo
 * @description: 和为s的两个数字
 * @date 2023/2/18 0018 16:22
 */
public class O57 {
}

class SolutionO57 {
    public int[] twoSum(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        List<Integer> list = new ArrayList<>();
        while (l<r){
            if (nums[l] + nums[r] > target){
                r--;
            } else if (nums[l] + nums[r] < target) {
                l++;
            }else {
                return new int[]{nums[r],nums[l]};
            }
        }
        return new int[0];
    }
}