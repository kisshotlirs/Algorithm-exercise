package array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mojo
 * @description: 合并相似的物品
 * @date 2023/2/28 0028 22:20
 */
public class L2363 {
}

class Solution2363 {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        int[] ints = new int[1000];
        for (int[] x : items1) {
            ints[x[0]]=ints[x[0]]+x[1];
        }
        for (int[] y : items2) {
            ints[y[0]]=ints[y[0]]+y[1];
        }
        ArrayList<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            if (ints[i]>0){
                //list.add(List.of(i,ints[i]));
            }
        }
        return list;
    }
}