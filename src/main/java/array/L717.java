package array;

/**
 * @author mojo
 * @description: 1比特与2比特字符
 * @date 2023/8/5 0005 11:07
 */
public class L717 {

    public boolean isOneBitCharacter(int[] bits) {
        int n = 0;
        while (n < bits.length) {
            if (n == bits.length-1) {
                return true;
            }
            n = bits[n]==1 ? n+2 : n+1;
        }
        return false;
    }
}
