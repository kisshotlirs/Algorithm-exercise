package array;

import java.util.Arrays;

/**
 * @author mojo
 * @description: 使用最小花费爬楼梯
 * @date 2023/8/11 0011 23:43
 */
public class L746 {

    public int minCostClimbingStairs(int[] cost) {
        int[] res = new int[cost.length + 1];
        res[1] = res[0] = 0;
        for (int i = 2; i <= cost.length; i++) {
            res[i] = Math.min(res[i-1]+cost[i-1], res[i-2]+cost[i-2]);
        }
        return res[cost.length];
    }
}
