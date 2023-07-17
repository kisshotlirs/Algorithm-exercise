package math;

/**
 * @author mojo
 * @description: 范围求和
 * @date 2023/7/17 0017 20:27
 */
public class L598 {

    public int maxCount(int m, int n, int[][] ops) {
        int mina = m, minb = n;
        for (int[] op : ops) {
            mina = Math.min(mina, op[0]);
            minb = Math.min(minb, op[1]);
        }
        return mina * minb;
    }

}
