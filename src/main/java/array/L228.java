package array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zyl
 * @description: 汇总区间
 */
public class L228 {

    public static void main(String[] args) {
        int[] nums =  {0,1,2,4,5,7};
        System.out.println(new L228().summaryRanges(nums));
    }

    public List<String> summaryRanges(int[] nums) {
        int len = nums.length;
        ArrayList<String> list = new ArrayList<>();
        for (int j = 0,i = 0; j < len; j++) {
            if (j+1 < len && nums[j]+1 == nums[j+1]){
                continue;
            }
            if (i == j){
                list.add(nums[i]+"");
            } else {
                list.add(nums[i]+"->"+nums[j]);
            }
            i = j+1;
        }
        return list;
    }
}
