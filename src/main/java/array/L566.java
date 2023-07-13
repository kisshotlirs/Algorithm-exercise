package array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mojo
 * @description: 重塑矩阵
 * @date 2023/7/13 0013 21:20
 */
public class L566 {

    public static void main(String[] args) {

    }

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int matR = mat.length;
        int matC = mat[0].length;
        if (matR*matC != r*c ) {
            return mat;
        }
        int[][] res = new int[r][c];
        for (int i = 0; i < matC * matR; i++) {
            res[i/c][i%c] = mat[i/matC][i%matC];
        }
        return res;
    }

}
