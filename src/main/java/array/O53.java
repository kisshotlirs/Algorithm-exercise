package array;

/**
 * @author mojo
 * @description: 0～n-1中缺失的数字
 * @date 2023/2/15 0015 12:23
 */
public class O53 {
    public static void main(String[] args) {
        int[] nums = {0,1};
        System.out.println(new SolutionO53().missingNumber(nums));
    }
}

class SolutionO53 {
    public int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i){
                return i;
            }
        }
        return nums[nums.length-1]+1;
    }
}