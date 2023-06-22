package math;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: zyl
 * @description: 完美数
 */
public class L507 {

    public static void main(String[] args) {

    }

    public boolean checkPerfectNumber(int num) {
        int count = 0;
        for (int i = 0; i < num; i++) {
            if (num % i == 0) {
                count+=i;
            }
        }
        return count == num;
    }
}
