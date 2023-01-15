package array;


/**
 * @author mojo
 * @description: TODO
 * @date 2023/1/15 0015 10:45
 */
public class L2293 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,2,4,8,2,2};
        Solution2293 solution2293 = new Solution2293();
        System.out.println(solution2293.minMaxGame(nums));
    }
}

class Solution2293 {
    public int minMaxGame(int[] nums) {
        int n = nums.length;
        while (n!=1){
            int[] newNums = new int[n/2];
            for (int i = 0; i < n; i++) {
                if (i<n/2 && i%2==0){
                    newNums[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
                }
                if (i<n/2 && i%2==1){
                    newNums[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
                }
            }
            nums = newNums;
            n = n/2;
        }
        return nums[0];

    }
}