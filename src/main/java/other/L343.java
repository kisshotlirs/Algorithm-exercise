package other;

/**
 * @author: zyl
 * @description:
 */
public class L343 {
    public static void main(String[] args) {
        System.out.println(new Solution343I().cuttingRope(13));
    }
}

class Solution343I {
    public int cuttingRope(int n) {
        if (n<=3){
            return n-1;
        }
        int b = n % 3;
        int p = 1000000007;
        long ret = 1;
        int lineNums = n/3;
        for (int i = 1; i < lineNums; i++) {
            ret = 3*ret % p;
        }

        if (b==0){
            return (int) (ret*3%p);
        }
        if (b==1){
            return (int) (ret*4%p);
        }
        return (int) (ret*6%p);
    }
}