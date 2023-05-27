package array;

/**
 * @author: zyl
 * @description: 盛最多水的容器
 */
public class L11 {

    public static void main(String[] args) {

    }

    public int maxArea(int[] height) {
        int l = 0,r = height.length-1;
        int res = 0;
        while (l < r){
            res = height[l] < height[r] ?
                    Math.max((r-l)*height[l++] , res) :
                    Math.max((r-l)*height[r--] , res);
        }
        return res;
    }
}
