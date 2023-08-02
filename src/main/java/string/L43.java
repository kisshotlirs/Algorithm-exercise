package string;

/**
 * @author mojo
 * @description: 字符串相乘
 * @date 2023/8/2 0002 20:02
 */
public class L43 {

    public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] res = new int[m + n];
        for (int i = m-1; i >= 0; i--) {
            int x = num1.charAt(i) - '0';
            for (int j = n; j > 0; j--) {
                int y = num2.charAt(j) - '0';
                res[i+j+1] = res[i+j+1]+x*y;
            }
        }
        for (int i = m + n - 1; i > 0; i--) {
            res[i-1] = res[i-1] + res[i]/10;
            res[i] %= 10;
        }
        int index = res[0] ==0 ? 1:0;
        StringBuffer stringBuffer = new StringBuffer();
        while (index < m+n) {
            stringBuffer.append(res[index]);
            index++;
        }
        return stringBuffer.toString();
    }
}
