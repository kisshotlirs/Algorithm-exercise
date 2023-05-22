package math;

/**
 * @author: zyl
 * @description: 有效的完全平方数
 */
public class L367 {

    public static void main(String[] args) {

    }

    public boolean isPerfectSquare(int num) {
        if (num == 1){
            return true;
        }
        for (int i = 1; i < num; i++) {
            if (i*i == num){
                return true;
            }
        }
        return false;
    }
}
