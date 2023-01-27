package string;

import java.util.HashSet;

/**
 * @author mojo
 * @description: 兼具大小写的最好英文字母
 * @date 2023/1/27 0027 10:31
 */
public class L2309 {
    public static void main(String[] args) {
        String s = "arRAzFif";
        Solution2309 solution2309 = new Solution2309();
        System.out.println(solution2309.greatestLetter(s));
    }
}

class Solution2309 {
    public String greatestLetter(String s) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            set.add(c);
        }
        for (int i = 25; i >= 0; i--) {
            if (set.contains((char)('a'+i)) && set.contains((char)('A'+i))){
                return String.valueOf((char) ('A'+i));
            }
        }
        return "";
    }
}