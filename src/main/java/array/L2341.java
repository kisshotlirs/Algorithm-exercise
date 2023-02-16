package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author mojo
 * @description: 数组能形成多少数对
 * @date 2023/2/16 0016 18:29
 */
public class L2341 {
}

class Solution2341 {
    public int[] numberOfPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (Integer value : map.values()) {
            if (value/2 >= 1){
                res = res+value/2;
            }
        }
        return new int[]{res,nums.length-2*res};
    }
}