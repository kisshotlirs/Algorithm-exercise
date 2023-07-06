package math;

import java.util.LinkedList;
import java.util.List;

/**
 * @author mojo
 * @description: 拆分成最多数目的正偶数之和
 * @date 2023/7/6 0006 20:38
 */
public class L22178 {

    public static void main(String[] args) {

    }

    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> list = new LinkedList<>();
        if (finalSum % 2 != 0) {
            return list;
        }
        for (long i = 2; i <= finalSum; i=i+2) {
            list.add(i);
            finalSum = finalSum - i;
        }
        list.set(list.size()-1, list.get(list.size()-1)+finalSum);
        return list;
    }

}
