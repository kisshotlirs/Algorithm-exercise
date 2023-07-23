package math;

/**
 * @author mojo
 * @description: 交替位二进制数
 * @date 2023/7/23 0023 11:51
 */
public class L693 {

    public boolean hasAlternatingBits(int n) {
        int lastBit = n & 1;
        n >>= 1;

        while (n > 0) {
            int currentBit = n & 1;

            if (currentBit == lastBit) {
                return false;
            }

            lastBit = currentBit;
            n >>= 1;
        }

        return true;
    }
}
