package array;

import java.util.Arrays;

/**
 * @author: zyl
 * @description: 特殊数组的特征值
 */
public class L1608 {
    public static void main(String[] args) {
        int[] nums = {3,5};
        System.out.println(new Solution1608().specialArray(nums));
    }
}

class Solution1608 {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i=0,j=n-1 ; i<j ; i++,j--){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        for (int i=1;i<=n;i++){
            if (nums[i-1]>=i && (i==n || nums[i]<i)){
                return i;
            }
        }
        return -1;
    }
}