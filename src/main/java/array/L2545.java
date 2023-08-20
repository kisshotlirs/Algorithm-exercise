package array;

import java.util.Arrays;

/**
 * @author mojo
 * @description: 根据第 K 场考试的分数排序
 * @date 2023/8/20 0020 16:11
 */
public class L2545 {

    public int[][] sortTheStudents(int[][] score, int k) {
        int[] r = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            int[] a = score[i];
            r[i] = a[k];
        }
        Arrays.sort(r);
        int[][] res = new int[score.length][score[0].length];

        int index = score.length-1;
        for (int i : r) {
            for (int[] arr : score) {
                if (arr[k] == i) {
                    res[index] = arr;
                    index--;
                }
            }
        }
        return res;
    }
}
