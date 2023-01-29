package string;

/**
 * @author mojo
 * @description: 统计星号
 * @date 2023/1/29 0029 11:08
 */
public class L2315 {
    public static void main(String[] args) {
        String s = "l|*e*et|c**o|*de|";
        System.out.println(new Solution2315().countAsterisks(s));
    }
}

class Solution2315 {
    public int countAsterisks(String s) {
        boolean b = true;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='|'){
                b=!b;
            } else if (b && s.charAt(i)=='*'){
                ans++;
            }
        }
        return ans;
    }
}