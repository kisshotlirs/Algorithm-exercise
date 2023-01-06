package string;

import java.util.Objects;

/**
 * @author mojo
 * @description: 验证回文串
 * @date 2023/1/6 0006 20:54
 */
public class L125 {
    public static void main(String[] args) {
        Solution125 solution125 = new Solution125();
        String s = "race a car";
        boolean palindrome = solution125.isPalindrome(s);
        System.out.println(palindrome);
    }
}

class Solution125 {
    public boolean isPalindrome(String s) {
        if (Objects.equals(s, " ")){
            return true;
        }
        String a = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        StringBuffer stringBuffer = new StringBuffer(a);

        if (a.equals(stringBuffer.reverse().toString())){
            return true;
        } else {
            return false;
        }
    }
}