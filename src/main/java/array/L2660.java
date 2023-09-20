package array;

/**
 * @author mojo
 * @description: 保龄球游戏的获胜者
 * @date 2023/9/20 0020 21:28
 */
public class L2660 {

    public static void main(String[] args) {
        int[] p1 = {5,6,1,10};
        int[] p2 = {5,1,10,5};
        System.out.println(new L2660().isWinner(p1, p2));
    }

    public int isWinner(int[] a, int[] b) {
        int x = 0, y = 0, n = a.length;
        for (int i = 0; i < n; i++) {
            if ((i - 1 >= 0) && a[i - 1] == 10 || ((i - 2 >= 0) && a[i - 2] == 10)) x += 2 * a[i];
            else x += a[i];

            if ((i - 1 >= 0) && b[i - 1] == 10 || ((i - 2 >= 0) && b[i - 2] == 10)) y += 2 * b[i];
            else y += b[i];
        }

        if (x > y) return 1;
        else if (x < y) return 2;
        return 0;
    }

}
