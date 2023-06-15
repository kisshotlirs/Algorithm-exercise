package math;

import java.util.Arrays;

/**
 * @author: zyl
 * @description: 数字的补数
 */
public class L476 {

    public static void main(String[] args) {

    }

    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        char[] chars = binary.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1') {
                chars[i] = '0';
            } else if (chars[i] == '0') {
                chars[i] = '1';
            }
        }
        return Integer.parseInt(String.valueOf(chars), 2);
    }
}
