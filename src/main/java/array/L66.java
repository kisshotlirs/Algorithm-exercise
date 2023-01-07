package array;

/**
 * @author mojo
 * @description: 加一
 * @date 2023/1/1 0001 11:29
 */
public class L66 {

    public static void main(String[] args) {
        int[] a={1,2,3};
        Solution66 solution = new Solution66();
        solution.plusOne(a);
    }
}

class Solution66 {
    public int[] plusOne(int[] digits) {

        int len=digits.length;
        for(int i=len-1;i>=0;i--){
            digits[i]=(digits[i]+1)%10;
            if( digits[i]!=0 ){
                return digits;
            }
        }

        int[] d2=new int[len+1];
        d2[0]=1;
        return d2;

    }
}