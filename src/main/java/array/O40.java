package array;

import java.util.Arrays;

/**
 * @author mojo
 * @description: TODO
 * @date 2023/1/23 0023 20:23
 */
public class O40 {
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        System.out.println(Arrays.toString(new SolutionO40().getLeastNumbers(arr, 2)));
    }
}

class SolutionO40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int[] res = new int[k];
        System.arraycopy(arr, 0, res, 0, k - 1 + 1);
        return res;
    }
}