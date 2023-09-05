package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author mojo
 * @description: 删除一个元素使数组严格递增
 * @date 2023/9/5 0005 20:44
 */
public class L1909 {

    public static void main(String[] args) {
        int[] nums = {1,2,10,5,7};
        System.out.println(new L1909().canBeIncreasing(nums));
    }

    public boolean canBeIncreasing(int[] nums) {
        int r = nums.length - 1, l = 0;
        while (l < r) {
            if (nums[l+1] > nums[l]) {
                l++;
            } else if (nums[r - 1] < nums[r]) {
                r--;
            } else {
                break;
            }
        }
        return (l == r) || (r == l+1 && (l == 0 || r == nums.length-1 || nums[r] > nums[l-1] || nums[l] < nums[r+1]));
    }
}
