package math;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: zyl
 * @description: 构造矩形
 */
public class L492 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new L492().constructRectangle(37)));
    }

    public int[] constructRectangle(int area) {
        int poor = Integer.MAX_VALUE;
        int[] arr = null;
        for (int len = (int)Math.sqrt(area); len >= 1; len--) {
            if (area % len == 0) {
                int width = area/len;
                int diff = Math.abs(len - width);
                if (diff < poor) {
                    poor = diff;
                    if (width > len) {
                        arr = new int[]{width, len};
                    } else {
                        arr = new int[]{len, width};
                    }
                }
            }
        }
        return arr;
    }
}
