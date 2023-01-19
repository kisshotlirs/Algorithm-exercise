package string;

import java.util.HashSet;
import java.util.Set;

/**
 * @author mojo
 * @description:  强密码检验器 II
 * @date 2023/1/19 0019 10:57
 */
public class L2299 {
    public static void main(String[] args) {
        String password = "11A!A!Aa";
        Solution2299 solution2299 = new Solution2299();
        System.out.println(solution2299.strongPasswordCheckerII(password));
    }
}

class Solution2299 {
    public boolean strongPasswordCheckerII(String password) {
        if (password.length()<8){
            return false;
        }

        Set<Character> specials = new HashSet<Character>() {{
            add('!');
            add('@');
            add('#');
            add('$');
            add('%');
            add('^');
            add('&');
            add('*');
            add('(');
            add(')');
            add('-');
            add('+');
        }};

        boolean low = false; boolean upper = false; boolean number = false; boolean special = false;
        boolean same = true;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isLowerCase(c)){
                low = true;
            } else if (Character.isUpperCase(c)){
                upper = true;
            } else if (Character.isDigit(c)){
                number = true;
            } else if (specials.contains(c)) {
                special = true;
            }
            if (i!=password.length()-1 && c==password.charAt(i + 1)) {
                same = false;
            }
        }
        return low && upper && number && special && same;
    }
}