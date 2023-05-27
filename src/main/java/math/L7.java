package math;

/**
 * @author: zyl
 * @description: 整数反转
 */
public class L7 {

    public static void main(String[] args) {
        int x = -123;
        System.out.println(new L7().reverse(x));
    }

    public int reverse(int x) {
        int res = 0;
        int last = 0;
        while (x != 0){
            int temp = x % 10;
            last = res;
            res = res*10 + temp;
            if (last != res/10){
                return 0;
            }
            x = x/10;
        }
        return res;
    }
}
