package array;

/**
 * @author mojo
 * @description: TODO
 * @date 2023/2/9 0009 20:22
 */
public class Ms3 {
}

class SolutionMs3{

    public int[][] change(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = arr[j][i];
            }
        }
        return arr;
    }
}