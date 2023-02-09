package array;

/**
 * @author mojo
 * @description: 将数组的最后一个元素移到第一位
 * @date 2023/2/9 0009 20:14
 */
public class Ms1 {
}

class SolutionMs1{

    public int[] changeA(int[] num){
        int n = num[num.length-1];
        num[0] = n;
        for (int i = 1; i < num.length-1; i++) {
            num[i] = num[i+1];
        }
        return num;
    }
}