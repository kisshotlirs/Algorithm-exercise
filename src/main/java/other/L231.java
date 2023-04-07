package other;

/**
 * @author: zyl
 * @description: 2的幂
 */
public class L231 {

    public static void main(String[] args) {
        System.out.println(new L231().isPowerOfTwo(8));
    }

    public boolean isPowerOfTwo(int n) {
        return (n>0) && (n&(n-1))==0;
    }
}
