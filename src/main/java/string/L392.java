package string;

/**
 * @author: zyl
 * @description: 判断子序列
 */
public class L392 {

    public static void main(String[] args) {
        String s = "b";
        String t = "abc";
        System.out.println(new L392().isSubsequence(s, t));
    }

    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty() ) {
            return true;
        }
        if (t.isEmpty()) {
            return false;
        }
        char[] arr = s.toCharArray();
        int j = 0;
        for (int i = 0; i < t.length(); i++) {
            if (j < s.length() && t.charAt(i) == arr[j]) {
                j++;
            }
        }
        return j == s.length();
    }
}
