package other;

/**
 * @author: zyl
 * @description: x的平方根
 */
public class L69 {
    public static void main(String[] args) {

    }
}

class Solution69 {
    public int mySqrt(int x) {
        int r = x;
        int l = 1;
        int ans = -1;
        while (l < r){
            int mid = l+(r-l)/2;
            if ((long)mid*mid<=x){
                ans = mid;
                l = mid-1;
            } else {
                r = mid-1;
            }
        }
        return ans;
    }
}