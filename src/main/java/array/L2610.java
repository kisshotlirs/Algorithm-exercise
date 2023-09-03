package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author mojo
 * @description: 转换二维数组
 * @date 2023/8/29 0029 20:59
 */
public class L2610 {

    public static void main(String[] args) {
        int[] arr = {1,3,4,1,2,3,1};
        System.out.println(new L2610().findMatrix(arr));
    }

    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, Integer> cnts = new HashMap<>();
        for (int num : nums) {
            int idx = cnts.getOrDefault(num, 0);
            cnts.put(num, idx+1);
            if (res.size() <= idx) {
                res.add(new ArrayList<>());
            }
            res.get(idx).add(num);
        }
        return res;
    }
}
