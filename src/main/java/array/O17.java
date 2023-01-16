package array;

import java.util.Arrays;

/**
 * @author mojo
 * @description: 打印从1到最大的n位数
 * @date 2023/1/16 0016 11:37
 */
public class O17 {
    public static void main(String[] args) {
        SolutionO17 solutionO17 = new SolutionO17();
        System.out.println(Arrays.toString(solutionO17.printNumbers(1)));
    }
}

class SolutionO17 {
    public int[] printNumbers(int n) {
        int m = 1;
        for (int i = 0; i < n; i++) {
            m = 10*m;
        }

        int[] s = new int[m-1];
        for (int i = 1; i <= m - 1; i++) {
            s[i-1] = i;
        }
        return s;
    }
}