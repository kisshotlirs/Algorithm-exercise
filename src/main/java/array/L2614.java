package array;

/**
 * @author mojo
 * @description: 对角线上的质数
 * @date 2023/9/13 0013 20:30
 */
public class L2614 {

    public int diagonalPrime(int[][] nums) {
        int max = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int l = nums[i][i];
            int r = nums[i][n - 1 - i];
            if (l > max && isPrime(l)) {
                max = l;
            }
            if (r > max && isPrime(r)) {
                max = r;
            }
        }
        return max;
    }

    private boolean isPrime(int n) {
        for (int i = 2; i * i <= n; ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return n >= 2;
    }
}
