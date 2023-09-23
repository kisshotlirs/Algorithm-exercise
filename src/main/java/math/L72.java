package math;

/**
 * @author mojo
 * @description: x的平方根
 * @date 2023/9/23 0023 21:52
 */
public class L72 {

    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }

    public static int mySqrt(int x) {
        int l = 0,r = x,ans = -1;
        while (l <= r) {
            int mid = (r+l)/2;
            if ((long)mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid -1;
            }
        }
        return ans;
    }
}
