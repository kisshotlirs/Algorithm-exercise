package array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author mojo
 * @description: 三数之和
 * @date 2023/2/17 0017 12:11
 */
public class L15 {
}

class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums==null || nums.length<3){
            return new ArrayList<>();
        }
        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i]>0){
                break;
            }
            if (i>0 && nums[i-1]==nums[i]){
                continue;
            }
            int l = i+1;
            int r = nums.length-1;
            while (l<r){
                int sum = nums[i]+nums[l]+nums[r];
                if (sum<0){
                    //去除重复值
                    while (l<r && nums[l]==nums[++l]) {;}
                } else if (sum>0){
                    while (r>l && nums[r]==nums[--r]) {;}
                } else {
                    list.add(new ArrayList<>(Arrays.asList(nums[i],nums[l],nums[r])));
                    while (l<r && nums[l]==nums[++l]) {;}
                    while (r>l && nums[r]==nums[--r]) {;}
                }
            }
        }
        return list;
    }
}