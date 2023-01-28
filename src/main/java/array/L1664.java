package array;

/**
 * @author mojo
 * @description: 生成平衡数组的方案数
 * @date 2023/1/28 0028 15:47
 */
public class L1664 {
    public static void main(String[] args) {
        int[] nums = {2,1,6,4};
        System.out.println(new Solution1664().waysToMakeFair(nums));
    }
}

class Solution1664 {
    public int waysToMakeFair(int[] nums) {
        int len = nums.length;
        //偶数和
        int oddSum = 0;
        //奇数和
        int evenSum = nums[0];
        for (int i = 1; i < len; i++) {
            if (i%2==1){
                oddSum = oddSum + nums[i];
            } else {
                evenSum = evenSum + nums[i];
            }
        }

        int evenCur = 0, oddCur = 0;
        int ans = 0;
        for (int i = 0; i < len; i++) {
            int num = nums[i];
            if ((i & 1) == 0) {
                if (evenSum - evenCur - num + oddCur == oddSum - oddCur + evenCur) {
                    ans++;
                }
                // 更新当前偶数和
                evenCur += num;
            } else {
                if (evenSum - evenCur + oddCur == oddSum - oddCur + evenCur - num) {
                    ans++;
                }
                //更新当前奇数和
                oddCur += num;
            }
        }
        return ans;
    }
}