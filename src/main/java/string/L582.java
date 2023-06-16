package string;

/**
 * @author: zyl
 * @description: 密钥格式化
 */
public class L582 {

    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int len = s.length(), num = 0;
        for (int i = len - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '-') {
                continue;
            }
            if (num == k) {
                num = 0;
                sb.append('-');
            }
            c = Character.toUpperCase(c);
            sb.append(c);
            num++;
        }
        return sb.reverse().toString();
    }
}
