package math;

/**
 * @author mojo
 * @description: 将钱分给最多的儿童
 * @date 2023/9/3 0003 22:08
 */
public class L2591 {

    public static void main(String[] args) {
        System.out.println(new L2591().distMoney(20, 3));
    }

    public int distMoney(int money, int children) {
        if (money < children ) {
            return -1;
        }
        if (money == 8*children) {
            return children;
        } else if (money > 8 * children) {
            return children-1;
        }

        money -=children;
        int i = money / 7;
        if (money%7 == 3) {
            return i == children-1 ? i-1 : i;
        }
        return i;
    }
}
