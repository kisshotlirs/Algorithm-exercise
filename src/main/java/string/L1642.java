package string;

import java.util.HashMap;

/**
 * @author: zyl
 * @description: 两个相同字符之间的最长子字符串
 */
public class L1642 {

    public static void main(String[] args) {
        String s = "cabbac";
        System.out.println(new L1642().maxLengthBetweenEqualCharacters(s));
    }

    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))){
                res = Math.max(res,i-map.get(s.charAt(i)));
            }else {
                map.put(s.charAt(i),i);
            }
        }
        return res-1;
    }
}
