package array;

import java.util.*;

/**
 * @author mojo
 * @description: 查找用户活跃分钟数
 * @date 2023/1/20 0020 10:20
 */
public class L1817 {
    public static void main(String[] args) {
        int[][] logs = {{1,1},{2,2},{2,3}};
        Solution1817 solution1817 = new Solution1817();
        System.out.println(Arrays.toString(solution1817.findingUsersActiveMinutes(logs, 4)));
    }
}

class Solution1817 {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int[] log : logs) {
            if (!map.containsKey(log[0])){
                map.put(log[0],new HashSet<>());
            }
            Set<Integer> set = map.get(log[0]);
            set.add(log[1]);
        }

        int[] ans = new int[k];
        for (Set<Integer> minutes : map.values()) {
            int size = minutes.size();
            ans[size-1]++;
        }
        return ans;
    }
}