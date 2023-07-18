package array;

import java.util.*;

/**
 * @author mojo
 * @description: 两个列表的最小索引总和
 * @date 2023/7/18 0018 22:03
 */
public class L599 {

    public static void main(String[] args) {

    }

    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    map.put(list1[i], i+j);
                }
            }
        }
        int minValue = Integer.MAX_VALUE; // 初始化最小值为最大整数
        List<String> minKeys = new ArrayList<>(); // 保存最小值的key的List

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int value = entry.getValue();

            if (value < minValue) {
                minValue = value;
                minKeys.clear(); // 清空之前保存的最小值的key
                minKeys.add(entry.getKey()); // 将当前key加入List
            } else if (value == minValue) {
                minKeys.add(entry.getKey()); // 将与当前最小值相等的key加入List
            }
        }
        return minKeys.toArray(new String[0]);
    }
}
