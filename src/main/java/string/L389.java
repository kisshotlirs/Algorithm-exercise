package string;

/**
 * @author: zyl
 * @description: 找不同
 */
public class L389 {

    public static void main(String[] args) {

    }

    public char findTheDifference(String s, String t) {
        int st = 0;
        int tt = 0;
        for (int i = 0; i < s.length(); i++) {
            st = s.charAt(i) + st;
        }
        for (int i = 0; i < t.length(); i++) {
            tt = t.charAt(i) + tt;
        }
        return (char) (tt-st);
    }
}
