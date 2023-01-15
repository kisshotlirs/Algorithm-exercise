package other;

/**
 * @author mojo
 * @description: 二进制中1的个数
 * @date 2023/1/15 0015 11:56
 */
public class L191_O15 {
    public static void main(String[] args) {
        int n = 00000000000000000000000000001011;
        Solution191 solution191 = new Solution191();
        System.out.println(solution191.hammingWeight(n));
    }
}

class Solution191 {

    /**
     * 输入必须是长度为 32 的 二进制串
     */
    public int hammingWeight(int n) {
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                ret++;
            }
        }
        return ret;
    }
}