package math;

/**
 * @author: zyl
 * @description: 4的幂
 */
public class L342 {

    public static void main(String[] args) {
        System.out.println(new L342().isPowerOfFour(4));
    }

    public boolean isPowerOfFour(int n) {
        if (n == 1){
            return false;
        }
        if (n < 4){
            return false;
        }
        while (n != 1){
            if (n % 4!=0){
                return false;
            }
            n = n/4;
        }
        return true;
    }
}
