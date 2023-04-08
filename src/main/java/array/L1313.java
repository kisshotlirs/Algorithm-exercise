package array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zyl
 * @description: 解压缩编码列表
 */
public class L1313 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        new L1313().decompressRLElist(nums);
    }

    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i=i+2) {
            for (int j = 0; j < nums[i]; j++) {
                list.add(nums[i+1]);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
