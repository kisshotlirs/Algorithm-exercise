package array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mojo
 * @description: 数组中出现次数超过一半的数字
 * @date 2023/1/22 0022 20:30
 */
public class L169_O39 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        Solution169 solution169 = new Solution169();
        System.out.println(solution169.majorityElement(nums));
    }
}

class Solution169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)){
                map.put(num,1);
            } else {
                map.put(num,map.get(num)+1);
            }
        }
        System.out.println(map);

        Map.Entry<Integer,Integer> majorityEntry = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (majorityEntry==null || entry.getValue()>majorityEntry.getValue()){
                majorityEntry  =  entry;
            }
        }
        return majorityEntry.getKey();
    }
}