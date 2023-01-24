package array;

import java.util.Arrays;

/**
 * @author mojo
 * @description: 统计一个圆中点的数目
 * @date 2023/1/24 0024 10:50
 */
public class L1828 {
    public static void main(String[] args) {
        int[][] points = {{1,3},{3,3},{5,3},{2,2}};
        int[][] queries = {{2,3,1},{4,3,1},{1,1,2}};
        System.out.println(Arrays.toString(new Solution1828().countPoints(points, queries)));
    }
}

class Solution1828 {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if ( (points[j][0]-queries[i][0])*(points[j][0]-queries[i][0])+
                        (points[j][1]-queries[i][1])*(points[j][1]-queries[i][1])<=queries[i][2]*queries[i][2] ){
                    ans[i]++;
                }
            }
        }
        return ans;
    }
}