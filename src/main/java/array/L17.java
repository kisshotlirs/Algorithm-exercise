package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author mojo
 * @description: 电话号码的字母组合
 * @date 2023/7/31 0031 21:52
 */
public class L17 {

    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits.length() == 0) {
            return list;
        }
        Map<Character, String> map = new HashMap<Character, String>(){
            {
                put('2', "abc");
                put('3', "def");
                put('4', "ghi");
                put('5', "jkl");
                put('6', "mno");
                put('7', "pqrs");
                put('8', "tuv");
                put('9', "wxyz");
            }
        };
        backTrack(list, map, digits, 0, new StringBuilder());
        return list;
    }

    private void backTrack(List<String> list, Map<Character, String> map, String digits, int i, StringBuilder stringBuilder) {
        if (i == digits.length()) {
            list.add(stringBuilder.toString());
        } else {
            char c = digits.charAt(i);
            String s = map.get(c);
            int length = s.length();
            for (int j = 0; j < length; j++) {
                stringBuilder.append(s.charAt(j));
                backTrack(list, map, s, i+1, stringBuilder);
                stringBuilder.deleteCharAt(i+1);
            }
        }
    }
}
