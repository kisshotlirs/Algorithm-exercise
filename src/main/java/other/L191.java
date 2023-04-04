package other;

import java.util.Arrays;

/**
 * @author: zyl
 * @description: 位1的个数
 */
public class L191 {

    public static void main(String[] args) {
        int n = 00000000000000000000000000001011;
        System.out.println(new L191().hammingWeight(n));
    }

    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
}