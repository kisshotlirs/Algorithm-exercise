package string;

/**
 * @author mojo
 * @description: 反转字符串中的单词
 * @date 2023/7/10 0010 20:28
 */
public class L557 {

    public static void main(String[] args) {

    }

    public String reverseWords(String s) {
        String[] split = s.split(" ");
        for (int i = 0; i < split.length; i++) {
            StringBuilder reverse = new StringBuilder(split[i]).reverse();
            split[i] = reverse.toString();
        }
        return String.join(" ", split);
    }
}
