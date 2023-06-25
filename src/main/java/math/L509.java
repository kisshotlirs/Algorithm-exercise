package math;

/**
 * @author mojo
 * @description: 斐波那契数
 * @date 2023/6/25 0025 20:31
 */
public class L509 {

    public static void main(String[] args) {

    }

    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
