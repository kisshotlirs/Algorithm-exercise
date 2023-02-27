package string;

/**
 * @author mojo
 * @description: 左旋转字符串
 * @date 2023/2/28 0028 0:03
 */
public class O58 {
}

class SolutionO58 {
    public String reverseLeftWords(String s, int n) {
        StringBuffer sb = new StringBuffer();
        sb.append(s.substring(n,s.length()));
        sb.append(s.substring(0,n));
        return sb.toString();
    }
}