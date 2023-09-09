package array;

import java.util.Arrays;

/**
 * @author mojo
 * @description: 早餐组合
 * @date 2023/9/9 0009 10:36
 */
public class L18 {

    public static void main(String[] args) {
        int[] stamp =  {10,20,5};
        int[] drinks = {5,5,2};
        System.out.println(new L18().breakfastNumber(stamp, drinks, 15));
    }

    public int breakfastNumber(int[] staple, int[] drinks, int x) {
        Arrays.sort(staple);
        Arrays.sort(drinks);

        int r = drinks.length-1;
        int res = 0;
        int mod = (int) (1e9+7);
        for (int i : staple) {
            if (i > x) {
                break;
            }
            int ans = getDrinks(drinks, x - i, r);
            res = (res+ans)%mod;
        }
        return res;
    }

    private int getDrinks(int[] drinks, int gap, int r) {
        int l = 0;
        int ans = -1;
        while (l <= r) {
            int mid = (r + l) / 2;
            if (drinks[mid] > gap) {
                r = mid-1;
            } else if (drinks[mid] <= gap){
                ans = mid;
                l = mid+1;
            }
        }
        return ans+1;
    }

}
