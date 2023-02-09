package array;

import java.util.ArrayList;

/**
 * @author mojo
 * @description: 13个人围成一圈顺序报数，报到3的退出圈子，找出最后留在圈子里的人的原来的序号
 * @date 2023/2/9 0009 20:21
 */
public class Ms2 {
    public static void main(String[] args) {
        int a=0,b=0;
        while (a<15){
            a++;
        }
        while (b++<15){};
        System.out.println("a: "+a);
        System.out.println("b: "+b);

        new SolutionMs2().sortQuery(13);
    }
}

class SolutionMs2{

    public void sortQuery(int d) {
        // TODO 先构造一个数组
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= d; i++) {
            arr.add(i);
        }
        int xiabiao = -1;
        int count = 0;
        // 循环查找
        int mun = 10;
        while (arr.size() > 1) {
            xiabiao++;
            count++;
            if (count == 3) {
                System.out.println("移除的是" + arr.get(xiabiao));
                arr.remove(xiabiao);
                count = 0;
                xiabiao = xiabiao - 1;
            }
            if (xiabiao == (arr.size() - 1)) {
                xiabiao = -1;
            }
            if (arr.size() == 1) {
                System.out.println("最后一个剩余的人是：" + arr.get(0));
                break;
            }
        }
    }

}