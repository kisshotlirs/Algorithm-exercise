package array;

import java.util.*;

/**
 * @author: zyl
 * @description: 找到所有数组中消失的数字
 */
public class L448 {

    public static void main(String[] args) {

    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (set.add(i)) {
                list.add(i);
            }
        }
        return list;
    }
}
