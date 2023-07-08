package array;

import java.util.Arrays;

/**
 * @author mojo
 * @description: 两数之和
 * @date 2023/7/8 0008 18:45
 */
public class L167 {

    public static void main(String[] args) {
        int[] ints = {2,7,11,15};
        System.out.println(Arrays.toString(new L167().twoSum(ints, 9)));
    }

    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length-1;
        while (l < r) {
            int tar = numbers[l] + numbers[r];
            int mid = (r-l+1)/2;
            if (tar > target) {
                r --;
            } else if (tar < target) {
                l ++;
            } else {
                return new int[]{l+1,r+1};
            }
        }
        return new int[0];
    }
}
