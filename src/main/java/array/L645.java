package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author: zyl
 * @description: 错误的集合
 */
public class L645 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,3};
        System.out.println(Arrays.toString(new Solution645().findErrorNums(nums)));
    }
}

class Solution645 {
    public int[] findErrorNums(int[] nums) {
        int[] err = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>(nums.length);
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (int i = 1; i <= nums.length; i++) {
            Integer count = map.getOrDefault(i, 0);
            if (count == 2){
                err[0] = i;
            } else if (count == 0) {
                err[1] = i;
            }
        }
        return err;
    }
}
