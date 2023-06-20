package math;

/**
 * @author: zyl
 * @description: 七进制
 */
public class L504 {

    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        boolean isNegative = num < 0;
        StringBuilder res = new StringBuilder();
        int abs = Math.abs(num);
        while (abs > 0) {
            int i = abs % 7;
            res.append(i);
            abs = abs/7;
        }
        if (isNegative) {
            res.append("-");
        }
        return res.reverse().toString();
    }
}
