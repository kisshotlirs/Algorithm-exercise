package string;

/**
 * @author mojo
 * @description: 字符串转换整数
 * @date 2023/7/30 0030 11:18
 */
public class L8 {

    public static void main(String[] args) {
        System.out.println(new L8().myAtoi("4193 with words"));
    }

    public int myAtoi(String s) {
        int sign = 1; // 符号，默认为正数
        int i = 0;
        int n = s.length();
        int result = 0;

        // 丢弃前导空格
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 判断符号
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i++) == '+') ? 1 : -1;
        }

        // 将数字字符转换为整数
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = Character.getNumericValue(s.charAt(i));

            // 检查是否溢出
            if (result > Integer.MAX_VALUE / 10
                    || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}
