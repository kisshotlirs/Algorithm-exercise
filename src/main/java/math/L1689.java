package math;

/**
 * @author mojo
 * @description: 十-二进制数的最少数目
 * @date 2023/8/16 0016 19:53
 */
public class L1689 {

    public int minPartitions(String n) {
        int maxDigit = 0;
        int length = n.length();
        for (int i = 0; i < length; i++) {
            int digit = n.charAt(i) - '0';
            maxDigit = Math.max(maxDigit, digit);
        }
        return maxDigit;
    }
}
