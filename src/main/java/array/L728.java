package array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mojo
 * @description: 自除数
 * @date 2023/8/8 0008 20:48
 */
public class L728 {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i < right; i++) {
            if (isDivide(i)) {
                list.add(i);
            }
        }
        return list;
    }

    private boolean isDivide(int num) {
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 0 || num % digit != 0) {
                return false;
            }
            temp = temp/10;
        }
        return true;
    }
}
