package math;

/**
 * @author: zyl
 * @description: 3的幂
 */
public class L326 {

    public static void main(String[] args) {

    }

    public boolean isPowerOfThree(int n) {
        while (n!=0 && n%3==0){
            n = n/3;
        }
        return n==1;
    }
}
