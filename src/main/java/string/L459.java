package string;

import java.util.HashSet;

/**
 * @author: zyl
 * @description: 重复的子字符串
 */
public class L459 {

    public static void main(String[] args) {
        String s = "abcabcabc";
        System.out.println(new L459().repeatedSubstringPattern(s));
    }

    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i = 1; i * 2 <= n; ++i) {
            if (n % i == 0) {
                boolean match = true;
                for (int j = i; j < n; ++j) {
                    if (s.charAt(j) != s.charAt(j - i)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    return true;
                }
            }
        }
        return false;
    }
}
