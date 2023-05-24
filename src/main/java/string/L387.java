package string;

import java.util.*;

/**
 * @author: zyl
 * @description: 字符串中的第一个唯一字符
 */
public class L387 {

    public static void main(String[] args) {

    }

    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.get(c) == 1){
                return s.indexOf(c);
            }
        }
        return -1;
    }
}
