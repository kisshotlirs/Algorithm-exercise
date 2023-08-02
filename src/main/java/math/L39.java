package math;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author mojo
 * @description: 组合总和
 * @date 2023/8/1 0001 20:32
 */
public class L39 {

    public static void main(String[] args) {
        int[] c = {2,3,5};
        System.out.println(new L39().combinationSum(c, 8));
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int len = candidates.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0) {
            return res;
        }

        Arrays.sort(candidates);
        ArrayDeque<Integer> path = new ArrayDeque<>();
        dfs(candidates, 0, len, target, path, res);
        return res;
    }

    private void dfs(int[] candidates, int begin, int len, int target, ArrayDeque<Integer> path, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(path));
        }

        for (int i = begin; i < len; i++) {
            if (target-candidates[i] < 0) {
                break;
            }

            path.addLast(candidates[i]);
            dfs(candidates, i, len, target-candidates[i], path, res);
            path.removeLast();
        }
    }

}
