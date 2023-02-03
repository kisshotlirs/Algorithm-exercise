package string;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author mojo
 * @description: 第一个只出现一次的字符
 * @date 2023/2/3 0003 21:56
 */
public class O50 {
    public static void main(String[] args) {

    }
}

class SolutionO50 {
    public char firstUniqChar(String s) {
        int len = s.length();
        if ("".equals(s) || len==0){
            return ' ';
        }

        HashMap<Character, Boolean> map = new HashMap<>(len);
        for (int i = 0; i < len; i++) {
            map.put(s.charAt(i),map.containsKey(s.charAt(i)));
        }
        for (int i = 0; i < len; i++) {
             if (map.get(s.charAt(i)).equals(Boolean.FALSE)){
                 return s.charAt(i);
             }
        }
        return ' ';
    }
}