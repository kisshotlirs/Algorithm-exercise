package other;

/**
 * @author mojo
 * @description: 剪绳子 1
 * @date 2023/2/5 0005 21:09
 */
public class L343_O14 {
    public static void main(String[] args) {
        System.out.println(new Solution343().cuttingRope(5));
    }
}

class Solution343 {
    public int cuttingRope(int n) {
        if (n<=3){
            return n-1;
        }
        int a = n / 3;
        int b = n % 3;
        //尽量分成每份为3，得到的乘积是最大值
        if (b==0){
            return (int) Math.pow(3,a);
        }
        if (b==1){
            //最后剩一个1，把前面一个3分配给它变成4
            return (int) Math.pow(3,a-1)*4;
        }
        return (int) Math.pow(3,a)*2;
    }
}