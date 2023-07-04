package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author mojo
 * @description: 巨震中的和
 * @date 2023/7/4 0004 20:35
 */
public class L2479 {

    public static void main(String[] args) {
        int[][] nums = {{7,2,1},{6,4,2},{6,5,3},{3,2,1}};
        System.out.println(new L2479().matrixSum(nums));
    }

    public int matrixSum(int[][] nums) {
        int res = 0;
        for (int[] num : nums) {
            Arrays.sort(num);
        }
        for (int i = 0; i < nums[0].length; i++) {
            int max = 0;
            for (int j = 0; j < nums.length; j++) {
                max = Math.max(max, nums[j][i]);
            }
            res += max;
        }
        return res;
    }

}
