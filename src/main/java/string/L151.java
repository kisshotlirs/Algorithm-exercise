package string;

/**
 * @author mojo
 * @description: 翻转单词顺序
 * @date 2023/2/22 0022 21:52
 */
public class L151 {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(new Solution151().reverseWords(s));
    }
}

class Solution151 {
    public String reverseWords(String s) {
        String[] arr = s.trim().split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = arr.length-1; i > 0; i--) {
            if (arr[i].equals("")) {
                continue;
            }
            sb.append(arr[i]).append(" ");
        }
        return sb.toString();
    }
}