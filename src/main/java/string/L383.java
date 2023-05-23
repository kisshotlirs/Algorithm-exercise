package string;

import java.util.HashMap;

/**
 * @author: zyl
 * @description: 赎金信
 */
public class L383 {

    public static void main(String[] args) {
        String a = "a",b = "b";

    }

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (map.containsKey(c)){
                map.put(c, map.get(c)+1);
            } else {
                map.put(c,1);
            }
        }

        for (int i = 0; i < magazine.length(); i++) {
            char b = magazine.charAt(i);
            if (map.containsKey(b)){
                map.put(b, map.get(b)-1);
            }
        }

        for (Integer value : map.values()) {
            if (value > 0){
                return false;
            }
        }
        return true;
    }
}
