package string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zyl
 * @description: 括号生成
 */
public class L22 {

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generateAll(new char[2*n],0,list);
        return list;
    }

    private void generateAll(char[] chars, int pos, List<String> list) {
        if (pos == chars.length){
            if (check(chars)){
                list.add(new String(chars));
            }
        }else {
            chars[pos] = '(';
            generateAll(chars,pos+1,list);
            chars[pos] = ')';
            generateAll(chars,pos+1,list);
        }
    }

    private boolean check(char[] chars) {
        int count = 0;
        for (char c : chars) {
            if (c == '('){
                count++;
            } else {
                count--;
            }
            if (count < 0){
                return false;
            }
        }
        return count==0;
    }
}
