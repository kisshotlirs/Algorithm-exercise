package hashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mojo
 * @description: 存在重复元素
 * @date 2023/1/14 0014 19:31
 */
public class L219 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        Solution219 solution219 = new Solution219();
        System.out.println(solution219.containsNearbyDuplicate(nums, k));
    }
}

class Solution219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            num = nums[i];
            if (map.containsKey(num) && i-map.get(num)<=k){
                return true;
            }
            map.put(num,i);
        }
        return false;
    }
}