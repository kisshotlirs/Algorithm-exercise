package hashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mojo
 * @description: 同构字符串
 * @date 2023/1/14 0014 13:30
 */
public class L205 {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        Solution205 solution205 = new Solution205();
        System.out.println(solution205.isIsomorphic(s, t));
        System.out.println(solution205.isIsomorphic1(s, t));
    }
}

class Solution205 {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sm = new HashMap<>(s.length());
        Map<Character, Character> tm = new HashMap<>(t.length());
        for (int i = 0; i < s.length(); i++) {
            if ((sm.containsKey(s.charAt(i))&&sm.get(s.charAt(i))!=t.charAt(i)) ||
                    (tm.containsKey(t.charAt(i))&&tm.get(t.charAt(i))!=s.charAt(i))){
                return false;
            }
            sm.put(s.charAt(i),t.charAt(i));
            tm.put(t.charAt(i),s.charAt(i));
        }
        return true;
    }

    public boolean isIsomorphic1(String s, String t) {
        Map<Character, Character> map = new HashMap<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))&&map.get(s.charAt(i))!=t.charAt(i)){
                return false;
            }
            map.put(s.charAt(i),t.charAt(i));
        }
        return true;
    }
}