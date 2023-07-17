package array;

import java.util.HashSet;

/**
 * @author mojo
 * @description: 分糖果
 * @date 2023/7/15 0015 10:53
 */
public class L575 {

    public static void main(String[] args) {

    }

    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : candyType) {
            set.add(i);
        }
        if (candyType.length/2 > set.size()) {
            return set.size();
        } else {
            return candyType.length/2;
        }
    }
}
