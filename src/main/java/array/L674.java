package array;

/**
 * @author: zyl
 * @description: 最长连续递增序列
 */
public class L674 {

    public static void main(String[] args) {
        int[] nums = {1,3,5,4,7};
        System.out.println(new L674().findLengthOfLCIS(nums));
    }

    public int findLengthOfLCIS(int[] nums) {
        int ans = 0;
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i>0 && nums[i]<=nums[i-1]){
                start = i;
            }
            ans = Math.max(ans,i-start+1);
        }
        return ans;
    }
}
