package string;

/**
 * @author mojo
 * @description: 最长回文子串
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 * 如果字符串的反序与原始字符串相同，则该字符串称为回文字符串。
 * @date 2023/1/2 0002 22:00
 */
public class L5 {
    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println(s.substring(0, 4));
    }
}

class Solution2 {
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2){
            return s;
        }

        int maxLen = 1;
        int begin = 0;
        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        char[] chars = s.toCharArray();
        for (int L=2; L<=len; L++){
            //枚举左边界
            for (int i = 0; i < len; i++) {
                //确定右边界
                int j=L+i-1;
                if (j >= len){
                    break;
                }
                if (chars[i] != chars[j]){
                    dp[i][j] = false;
                } else {
                    if (j-i < 3){
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i+1][j-1];
                    }
                }

                if (dp[i][j] && j-i+1>maxLen){
                    maxLen = j-i+1;
                    begin = i;
                }
            }
        }
        return s.substring(begin,begin+maxLen);
    }

    public boolean isRound(String s){
        int len = s.length();
        if (len <= 1){
            return false;
        }
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) != s.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }

}