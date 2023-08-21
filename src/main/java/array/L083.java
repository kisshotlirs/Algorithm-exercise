package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author mojo
 * @description: 全排列
 * @date 2023/8/21 0021 19:31
 */
public class L083 {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(new L083().permute(nums));
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        List<Integer> output = new ArrayList<>();
        for (int num : nums) {
            output.add(num);
        }
        backTrack(nums.length, output, res, 0);
        return res;
    }

    private void backTrack(int length, List<Integer> output, List<List<Integer>> res, int first) {
        if (first == length) {
            res.add(new ArrayList<>(output));
        }
        for (int i = first; i < length; i++) {
            Collections.swap(output, first, i);
            //递归填下一个数
            backTrack(length, output, res, first+1);
            //撤销操作
            Collections.swap(output, first, i);
        }
    }

}
