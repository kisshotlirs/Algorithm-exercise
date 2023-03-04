package other;

/**
 * @author mojo
 * @description: 不用加减乘除做加法
 * @date 2023/3/5 0005 0:02
 */
public class O65 {

}

class SolutionO65 {
    public int add(int a, int b) {
        while (b!=0){
            //c表示进位 进位值为a&b
            int c = (a&b)<<1;
            //a表示非进位 位置和 非进位为a^b
            a = a^b;
            b = c;
        }
        return a;
    }
}