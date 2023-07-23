package array;

import java.util.LinkedList;
import java.util.List;

/**
 * @author mojo
 * @description: 柠檬水找零
 * @date 2023/7/22 0022 18:47
 */
public class L860 {

    public boolean lemonadeChange(int[] bills) {
        int five = 0,ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five < 0) {
                    return false;
                }
                five--;
                ten++;
            } else if (bill == 20) {
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five = five-3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
