package math;

/**
 * @author: zyl
 * @description: Nim游戏
 */
public class L292 {

    public boolean canWinNim(int n) {
        if(n <= 3){
            return true;
        }
        return n%4 == 0;
    }
}
