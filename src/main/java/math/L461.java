package math;

/**
 * @author: zyl
 * @description: 汉明距离
 */
public class L461 {

    public static void main(String[] args) {

    }

    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

}
