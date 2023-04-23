package string;

/**
 * @author: zyl
 * @description: 机器人能否返回原点
 */
public class L657 {

    public static void main(String[] args) {

    }

    public boolean judgeCircle(String moves) {
        int len = moves.length();
        int x = 0,y = 0;
        for (int i = 0; i < len; i++) {
            char c = moves.charAt(i);
            if (c == 'U'){
                y++;
            } else if (c == 'D') {
                y--;
            } else if (c == 'L') {
                x--;
            } else if (c == 'R') {
                x++;
            }
        }
        return x==0 & y==0;
    }
}
