package hashTable;

import java.util.HashSet;
import java.util.Set;

/**
 * @author mojo
 * @description: 快乐数
 * @date 2023/1/14 0014 13:02
 */
public class L202 {
    public static void main(String[] args) {
        int n = 19;
        Solution202 solution202 = new Solution202();
        System.out.println(solution202.isHappy(n));
    }
}

class Solution202 {

    public int getSum(int n){
        int sum = 0;
        while (n>0){
            int d = n%10;
            n = n/10;
            sum = sum+ d*d;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n!=1 && !set.contains(n)){
            set.add(n);
            n = getSum(n);
        }
        return n==1;
    }
}