package array;

import java.util.ArrayList;

/**
 * @author mojo
 * @description: 和为s的连续正数序列 滑动窗口 双指针
 * @date 2023/2/21 0021 11:33
 */
public class O57II {
    public static void main(String[] args) {
        int[][] res = new SolutionO57II().findContinuousSequence(9);
        for (int[] re : res) {
            for (int i = 0; i < re.length; i++) {
                System.out.println(re[i]);
            }
        }
    }
}

class SolutionO57II {
    public int[][] findContinuousSequence(int target) {
        ArrayList<int[]> list = new ArrayList<>();
        int i=1,j=2,sum=3;
        while (i<j){
            if (sum==target){
                int[] ans = new int[j - i + 1];
                for (int k=i;k<=j;k++){
                    ans[k-i]=k;
                }
                list.add(ans);
            }
            if (sum>target){
                sum=sum-i;
                i++;
            }else {
                j++;
                sum=sum+j;
            }
        }
        return list.toArray(new int[0][]);
    }
}