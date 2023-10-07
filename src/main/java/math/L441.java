package math;

/**
 * @author mojo
 * @description: 排列硬币
 * @date 2023/10/7 0007 20:57
 */
public class L441 {

    public static void main(String[] args) {
        System.out.println(arrangeCoins(4));
    }

    public static int arrangeCoins(int n) {
        int res = 0;
        while (res < n) {
            n = n- ++res;
        }
        return res;
    }
}
