package math;

/**
 * @author mojo
 * @description: 交替数字和
 * @date 2023/7/12 0012 20:57
 */
public class L2544 {

    public int alternateDigitSum(int n) {
        String s = String.valueOf(n);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int x = s.charAt(i) - '0';
            if ((i & 1) == 0) {
                count += x;
            } else {
                count -= x;
            }
        }
        return count;
    }
}
