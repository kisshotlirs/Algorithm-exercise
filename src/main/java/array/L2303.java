package array;

/**
 * @author mojo
 * @description: 计算应缴税款总额
 * @date 2023/1/23 0023 19:41
 */
public class L2303 {
    public static void main(String[] args) {
        int[][] brackets = {{3,50},{7,10},{12,25}};
        System.out.println("税款："+new Solution2303().calculateTax(brackets, 10));
    }
}

class Solution2303 {
    public double calculateTax(int[][] brackets, int income) {
        int lower = 0;
        double total = 0;
        for (int[] bracket : brackets) {
            int upper = bracket[0];
            int percent = bracket[1];
            int tl = (Math.min(upper, income) - lower) * percent;
            total = total+tl;
            if (income<=upper){
                break;
            }
            lower = upper;
        }
        return total/100.0;
    }
}