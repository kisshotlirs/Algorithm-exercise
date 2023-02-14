package hashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mojo
 * @description: 表现良好的最长时间段
 * @date 2023/2/14 0014 11:07
 */
public class L1124 {
    public static void main(String[] args) {
        int[] hours = {9,9,6,8,6};
        System.out.println(new Solution1124().longestWPI(hours));
    }
}

class Solution1124 {
    public int longestWPI(int[] hours) {
        int ans = 0,s = 0;
        Map<Integer, Integer> map = new HashMap<>(hours.length);
        for (int i = 0; i < hours.length; i++) {
            if (hours[i]>8){
                s=s+1;
            }else {s=s+-1;}

            if (s>0){
                ans = i+1;
            } else if (map.containsKey(s - 1)) {
                ans = Math.max(ans,i- map.get(s-1));
            }
            map.putIfAbsent(s,i);
        }
        return ans;
    }
}