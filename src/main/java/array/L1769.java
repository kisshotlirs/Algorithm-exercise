package array;

import java.util.Arrays;

/**
 * @author mojo
 * @description: 移动所有球到每个盒子所需的最小操作数
 * @date 2023/8/15 0015 20:28
 */
public class L1769 {

    public static void main(String[] args) {
        String boxes = "110";
        System.out.println(Arrays.toString(new L1769().minOperations(boxes)));
    }

    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int sm = 0;
            for (int j = 0; j < n; j++) {
                if (boxes.charAt(j) == '1') {
                    sm += Math.abs(j - i);
                }
            }
            res[i] = sm;
        }
        return res;
    }

}
