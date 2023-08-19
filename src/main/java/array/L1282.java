package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author mojo
 * @description: 用户分组
 * @date 2023/8/19 0019 9:49
 */
public class L1282 {

    public static void main(String[] args) {
        int[] groupSizes = {3,3,3,3,3,1,3};
        System.out.println(new L1282().groupThePeople(groupSizes));
    }

    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < groupSizes.length; i++) {
            int cur = groupSizes[i];
            if (!map.containsKey(cur)) {
                map.put(cur, new ArrayList<>());
            }
            map.get(cur).add(i);
            if (map.get(cur).size() == cur) {
                res.add(map.get(cur));
                map.remove(cur);
            }
        }
        return res;
    }
}
