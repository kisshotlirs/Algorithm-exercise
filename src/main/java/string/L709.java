package string;

/**
 * @author mojo
 * @description: 转换成为小写字母
 * @date 2023/8/3 0003 20:30
 */
public class L709 {

    public String toLowerCase(String s) {
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                res.append(Character.toLowerCase(c));
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }
}
