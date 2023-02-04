package array;

import java.util.Arrays;

/**
 * @author mojo
 * @description: 你能构造出连续值的最大数目
 * @date 2023/2/4 0004 17:46
 */
public class L1798 {
    public static void main(String[] args) {
        int[] coins = {1,1,1,4};
        System.out.println(new SolutionL1798().getMaximumConsecutive(coins));
    }
}

class SolutionL1798 {
    public int getMaximumConsecutive(int[] coins) {
        Arrays.sort(coins);
        int res = 1;
        for (int coin : coins) {
            if (coin>res){
                return res;
            }
            res = res+coin;
        }
        return res;
    }
}