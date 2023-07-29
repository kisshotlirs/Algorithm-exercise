package hashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mojo
 * @description: 数组的度
 * @date 2023/7/29 0029 23:37
 */
public class L697 {

    public static void main(String[] args) {

    }

    public int findShortestSubArray(int[] nums) {
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.get(nums[i])[0]++;
                map.get(nums[i])[2] = i;
            } else {
                map.put(nums[i], new int[]{1,i,i});
            }
        }
        int maxNum = 0;
        int minLen = 0;
        for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
            int[] arr = entry.getValue();
            if (maxNum < arr[0]) {
                maxNum = arr[0];
                minLen = arr[2] - arr[1]+1;
            } else if (maxNum == arr[0]) {
                if (minLen > arr[2]-arr[1]+1) {
                    minLen = arr[2]-arr[1]+1;
                }
            }
        }
        return minLen;
    }
}
