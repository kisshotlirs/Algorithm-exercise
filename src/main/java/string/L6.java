package string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zyl
 * @description: n字形变换
 */
public class L6 {

    public static void main(String[] args) {

    }

    public String convert(String s, int numRows) {
        if (numRows < 2){
            return s;
        }
        List<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuilder());
        }
        int i = 0,flag = -1;
        for (char c : s.toCharArray()) {
            list.get(i).append(c);

        }
        return null;
    }
}
