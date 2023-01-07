package array;

/**
 * @author mojo
 * @description: 买股票的最佳时机
 * @date 2023/1/7 0007 20:48
 */
public class L121 {
    public static void main(String[] args) {
        int[] s = {3,7,9,1,6};
        Solution121 solution121 = new Solution121();
        System.out.println(solution121.maxProfit(s));
    }
}

class Solution121 {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i]<min){
                min = prices[i];
            } else if (prices[i]-min>max) {
                max = prices[i]-min;
            }
        }
        return max;
    }
}