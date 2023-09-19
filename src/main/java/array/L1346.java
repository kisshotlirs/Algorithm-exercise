package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author mojo
 * @description: 检查整数及其两倍数是否存在
 * @date 2023/9/19 0019 21:12
 */
public class L1346 {

    public static void main(String[] args) {
        int[] arr = {10,2,5,3};
        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist1(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (set.contains(2*i) || (i%2 == 0 || set.contains(i/2)) ) {
                return true;
            }
            set.add(i);
        }
        return false;
    }

    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int l = 0,r = arr.length-1;
        while (l <= arr.length && r >= 0) {
            int left = arr[l];
            int right = arr[r];
            if (right / left == 2) {
                return true;
            } else if (right / left > 2) {
                r--;
            } else {
                l++;
            }
        }
        return false;
    }
}
