package string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author mojo
 * @description: 表示数值的字符串
 * @date 2023/1/19 0019 12:09
 */
public class O20 {
    public static void main(String[] args) {
        String s = " .";
        SolutionO20 solutionO20 = new SolutionO20();
        System.out.println(solutionO20.isNumber(s));
    }
}

class SolutionO20 {
    public boolean isNumber(String s) {
        Set<Character> set = new HashSet<>();
        set.add('0');
        set.add('1');
        set.add('2');
        set.add('3');
        set.add('4');
        set.add('5');
        set.add('6');
        set.add('7');
        set.add('8');
        set.add('9');
        set.add('+');
        set.add('-');
        set.add(' ');
        set.add('.');

        if (" ".equals(s)){
            return false;
        }

        char c = ' ';
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (!set.contains(c)){
                return false;
            }
        }
        if (c=='+' || c=='-'){
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            if (c1=='.' && i==0){
                if (i+1<s.length() && s.charAt(i+1)==' '){
                    return false;
                } else if (s.length()==1){
                    return false;
                } else {return true;}
            }
            if (c1 == '.' && i == s.length() - 1) {
                if (i-1>=0 && s.charAt(s.length()-2)==' '){
                    return false;
                } else {return true; }
            }
        }
        return true;
    }
}