package array;

import java.util.Arrays;

/**
 * @author: zyl
 * @description: 将每个元素替换为右侧最大元素
 */
public class L1299 {

    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        System.out.println(Arrays.toString(new L1299().replaceElements(arr)));
    }

    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        int max = arr[len-1];
        arr[len-1] = -1;
        for (int i=len-2 ; i>=0 ; i--){
            int temp = max;
            if (arr[i] >= max){
                max = arr[i];
            }
            arr[i] = temp;
        }
        return arr;
    }
}
