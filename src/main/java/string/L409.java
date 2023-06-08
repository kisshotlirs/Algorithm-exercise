package string;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: zyl
 * @description: 最长回文串
 */
public class L409 {

    public static void main(String[] args) {

    }

    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!set.remove(c)) {
                set.add(c);
            }
        }
        return set.size() == 0 ? s.length() : s.length()- set.size()+1;
    }
}
