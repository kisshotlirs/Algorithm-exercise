package array;

/**
 * @author mojo
 * @description: 在排序数组中查找数字 I
 * @date 2023/2/15 0015 12:18
 */
public class L34 {
}

class Solution34 {
    public int search(int[] nums, int target) {
        int count = 0;
        for (int num : nums) {
            if (num == target){
                count++;
            }
        }
        return count;
    }
}