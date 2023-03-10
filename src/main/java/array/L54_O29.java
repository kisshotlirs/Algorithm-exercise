package array;

import java.util.Arrays;

/**
 * @author mojo
 * @description: 顺时针打印矩阵
 * @date 2023/1/20 0020 11:33
 */
public class L54_O29 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        System.out.println(Arrays.toString(new Solution54().spiralOrder(matrix)));
    }
}

class Solution54 {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length == 0) {
            return new int[0];
        }
        int l = 0, r = matrix[0].length - 1, t = 0, b = matrix.length - 1, x = 0;
        int[] res = new int[(r + 1) * (b + 1)];
        while(true) {
            for(int i = l; i <= r; i++) {
                // left to right.
                res[x++] = matrix[t][i];
            }
            if(++t > b) {
                break;
            }
            for(int i = t; i <= b; i++) {
                // top to bottom.
                res[x++] = matrix[i][r];
            }
            if(l > --r) {
                break;
            }
            for(int i = r; i >= l; i--) {
                // right to left.
                res[x++] = matrix[b][i];
            }
            if(t > --b) {
                break;
            }
            for(int i = b; i >= t; i--) {
                // bottom to top.
                res[x++] = matrix[i][l];
            }
            if(++l > r) {
                break;
            }
        }
        return res;
    }
}