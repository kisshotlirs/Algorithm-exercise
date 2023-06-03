package string;

/**
 * @author: zyl
 * @description: 找出字符串中第一个匹配项的下标
 */
public class L28 {
    public static void main(String[] args) {
        String m = "abc";
        String n = "c";
        System.out.println(new L28().strStr(m, n));
    }

    public int strStr(String haystack, String needle) {
        int l = haystack.length();
        int r = needle.length();
        for (int i = 0; i <= l - r; i++) {
            int n = 0, b = i;
            while (n < r && haystack.charAt(b) == needle.charAt(n)){
                b ++ ;
                n ++ ;
            }
            if (n == r){
                return i;
            }
        }
        return -1;
    }
}
