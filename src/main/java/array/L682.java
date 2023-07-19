package array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mojo
 * @description: 棒球比赛
 * @date 2023/7/19 0019 21:02
 */
public class L682 {

    public int calPoints(String[] operations) {
        int ret = 0;
        List<Integer> points = new ArrayList<Integer>();
        for (String op : operations) {
            int n = points.size();
            switch (op.charAt(0)) {
                case '+':
                    ret += points.get(n - 1) + points.get(n - 2);
                    points.add(points.get(n - 1) + points.get(n - 2));
                    break;
                case 'D':
                    ret += 2 * points.get(n - 1);
                    points.add(2 * points.get(n - 1));
                    break;
                case 'C':
                    ret -= points.get(n - 1);
                    points.remove(n - 1);
                    break;
                default:
                    ret += Integer.parseInt(op);
                    points.add(Integer.parseInt(op));
                    break;
            }
        }
        return ret;
    }
}
