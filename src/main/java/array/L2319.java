package array;

/**
 * @author mojo
 * @description: 判断矩阵是否是一个 X 矩阵
 * @date 2023/1/31 0031 11:38
 */
public class L2319 {
}

class Solution2319 {
    public boolean checkXMatrix(int[][] grid) {
        int len = grid.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i+j+1 == len || i==j){
                    if (grid[i][j] == 0){
                        return false;
                    }
                } else {
                    if (grid[i][j] != 0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}