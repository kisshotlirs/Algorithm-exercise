package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: zyl
 * @description: 两个数组的交集
 */
public class L349 {

    public static void main(String[] args) {
        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};
        System.out.println(Arrays.toString(new L349().intersection(num1, num2)));
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>(),set2 = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums1) {
            list.add(i);
        }
        for (int j : nums2) {
            set2.add(j);
        }
        list.retainAll(set2);
        set1.addAll(list);
        return set1.stream().mapToInt(x -> x).toArray();
    }
}
