package string;

/**
 * @author mojo
 * @description: 最长特殊序列
 * @date 2023/7/2 0002 17:14
 */
public class L521 {

    public int findLUSlength(String a, String b) {
        if (a.equals(b)) {
            return -1;
        }
        if (a.length() == b.length()) {
            return a.length();
        } else {
            return Math.max(a.length(), b.length());
        }
    }
}
