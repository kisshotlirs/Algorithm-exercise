package string;

/**
 * @author mojo
 * @description: 严格回文的数字
 * @date 2023/8/14 0014 20:34
 */
public class L2396 {

    public boolean isStrictlyPalindromic(int n) {
        for (int i = 2; i <= n-2; i++) {
            if (!isRe(Integer.toString(n, i))) {
                return false;
            }
        }
        return true;
    }

    private boolean isRe(String s) {
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
}
