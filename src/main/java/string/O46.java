package string;

import java.util.Arrays;

/**
 * @author: zyl
 * @description: 把数字翻译成字符串
 */
public class O46 {
    public static void main(String[] args) {
        System.out.println(new SolutionO46().translateNum(12258));
    }
}

class SolutionO46 {
    public int translateNum(int num) {
        String s = String.valueOf(num);
        int[] dp = new int[s.length()+1];
        Arrays.fill(dp,1);
        for(int i=2;i<=s.length();i++){
            int tmp = Integer.valueOf( s.substring(i-2,i));
            if(tmp>=10 && tmp <=25){
                dp[i] = dp[i-2]+dp[i-1];
            }else{
                dp[i] = dp[i-1];
            }
        }
        return dp[s.length()];
    }
}