package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author: zyl
 * @description: 无重复字符的最长子串 滑动窗口
 */
public class L3 {

    public static void main(String[] args) {
        String s = "dvdf";
        System.out.println(new L3().lengthOfLongestSubstring(s));
    }

    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (len == 0){
            return 0;
        }

        int left = 0;
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (map.containsKey(s.charAt(i))){
                left = Math.max(left,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            count = Math.max(count,i-left+1);
        }
        return count;
    }
}
