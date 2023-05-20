package array;

import java.util.Arrays;

/**
 * @author: zyl
 * @description: 比特位计数
 */
public class L338 {

    public static void main(String[] args) {
        int i = 2 & 1;
        System.out.println(i);
        int[] ints = new L338().countBits(3);
        System.out.println(Arrays.toString(ints));
    }

    public int[] countBits(int n) {
        int[] arr = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            arr[i] = countOne(i);
        }
        return arr;
    }

    private int countOne(int i) {
        int count = 0;
        while (i>0){
            i = i&(i-1);
            count++;
        }
        return count;
    }
}
