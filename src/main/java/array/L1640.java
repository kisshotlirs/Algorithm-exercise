package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: zyl
 * @description: 能否连接形成数组
 */
public class L1640 {

    public static void main(String[] args) {
        int[] arr = {91,4,64,78};
        int[][] pieces = {{78},{4,64},{91}};
    }

    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, Integer> map = new HashMap<>(pieces.length);
        for (int i = 0; i < pieces.length; i++) {
            map.put(pieces[i][0],i);
        }
        for (int i = 0; i < arr.length; ) {
            if (!map.containsKey(arr[i])){
                return false;
            }
            int j = map.get(arr[i]);
            int len = pieces[j].length;
            for (int k = 0; k < len; k++) {
                if (arr[i+k]!=pieces[j][k]){
                    return false;
                }
            }
            i = i+len;
        }
        return true;
    }

    public boolean canFormArray1(int[] arr, int[][] pieces) {
        String ps = Arrays.deepToString(pieces);
        String as = Arrays.toString(arr);
        for (int i = 0; i < ps.length(); i++) {
            if (ps.indexOf(i)!=as.indexOf(i)){
                return false;
            }
        }
        return true;
    }
}
