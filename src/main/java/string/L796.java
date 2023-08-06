package string;

import java.util.HashSet;

/**
 * @author mojo
 * @description: 旋转字符串
 * @date 2023/8/6 0006 22:21
 */
public class L796 {

    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s+s).contains(goal);
    }
}
