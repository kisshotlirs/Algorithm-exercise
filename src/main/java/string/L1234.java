package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author mojo
 * @description: 替换子串得到平衡字符串
 * @date 2023/2/13 0013 12:25
 */
public class L1234 {
    public static void main(String[] args) {
        String s = "QQWERR";
        System.out.println(new Solution1234().balancedString(s));
    }
}

class Solution1234 {
    public int balancedString(String s) {
        int[] count = new int[4];
        String target = "QWER";
        int n = s.length();
        for (int i = 0; i < n; i++) {
            count[target.indexOf(s.charAt(i))]++;
        }

        int m = n/4;
        if (count[0]==m && count[1]==m && count[2]==m && count[3]==m){
            return 0;
        }

        int ans = n;
        for (int i=0,j=0 ; i<n; i++){
            count[target.indexOf(s.charAt(i))]--;
            while (j<=i && count[0]<=m && count[1]<=m && count[2]<=m && count[3]<=m){
                ans = Math.min(ans,i-j+1);
                count[target.indexOf(s.charAt(j++))]++;
            }
        }
        return ans;
    }
}