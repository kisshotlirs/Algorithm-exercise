package other;

/**
 * @author: zyl
 * @description: 各位相加
 */
public class L258 {

    public static void main(String[] args) {
        System.out.println(new L258().addDigits(123));
    }

        public int addDigits(int num) {
            while (num >= 10){
                int sum = 0;
                while (num > 0){
                    sum = sum + num%10;
                    num = num/10;
                }
                num = sum;
            }
            return num;
        }
}
