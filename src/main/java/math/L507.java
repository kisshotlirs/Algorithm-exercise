package math;


/**
 * @author: zyl
 * @description: 完美数
 */
public class L507 {

    public static void main(String[] args) {

    }

    public boolean checkPerfectNumber(int num) {
        int count = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                count+=i;
            }
        }
        return count == num;
    }
}
