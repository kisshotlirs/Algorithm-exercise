package other;

import java.text.DecimalFormat;

/**
 * @author mojo
 * @description: 数值的整数次方
 * @date 2023/1/17 0017 11:24
 */
public class L50_O16 {
    public static void main(String[] args) {
        Solution50 solution50 = new Solution50();
        System.out.println(solution50.myPow(2.00000, -1));
    }
}

class Solution50 {
    public double myPow(double x, int n) {
        double sum = 1;
        if (n == 0){
            return sum;
        } else if (n>0){
            sum = getSum(x,n,sum);
        } else {
            DecimalFormat df = new DecimalFormat("0.00");
            sum = Double.parseDouble(df.format((double) 1 / getSum(x,-n,sum)));
        }
        return sum;
    }

    private double getSum(double x, int n,double sum) {
        for (int i = 0; i < n; i++) {
            sum = sum*x;
        }
        return sum;
    }

    public double myPow1(double x, int n) {
        if(x == 0) {
            return 0;
        }
        long b = n;
        double res = 1.0;
        if(b < 0) {
            x = 1 / x;
            b = -b;
        }
        while(b > 0){
            // 最后一位为1，需要乘上该位上的权重
            if((b & 1) == 1){
                res *= x;
            }
            x *= x;
            b >>= 1;
        }
        return res;
    }
}