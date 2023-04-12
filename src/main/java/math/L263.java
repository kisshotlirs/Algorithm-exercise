package math;

/**
 * @author: zyl
 * @description: 丑数
 */
public class L263 {

    public boolean isUgly(int n) {
        if(n <= 0){
            return false;
        }
        int[] am = {2,3,5};
        for (int i : am) {
            while (n % i == 0){
                n = n/i;
            }
        }
        return n==1;
    }
}
