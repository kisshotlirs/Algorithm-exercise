package array;

import java.util.Arrays;

/**
 * @author mojo
 * @description: 调整数组顺序使奇数位于偶数前面
 * @date 2023/1/17 0017 12:08
 */
public class O21 {
    public static void main(String[] args) {
        SolutionO21 solutionO21 = new SolutionO21();
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(solutionO21.exchange(nums)));
    }
}

class SolutionO21 {
    public int[] exchange(int[] nums) {
        int[] res = new int[nums.length];
        int l = 0;
        int r = nums.length-1;
        for (int num : nums) {
            if (num%2==0){
                res[r--] = num;
            }else {
                res[l++] = num;
            }
        }
        return res;
    }
}