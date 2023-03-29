package other;

/**
 * @author: zyl
 * @description: 爬楼梯
 */
public class L70 {
    public static void main(String[] args) {
        System.out.println(new Solution70().climbStairs1(3));
    }
}

class Solution70 {
    public int climbStairs(int n) {
        if (n == 1){
            return 1;
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i=3 ; i<=n ; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public int climbStairs1(int n) {
        if (n == 1){
            return 1;
        }

        int m1 = 1;
        int m2 = 2;
        for (int i=3 ; i<=n ; i++){
            int m3 = m1+m2;
            m1 = m2;
            m2 = m3;
        }
        return m2;
    }

}