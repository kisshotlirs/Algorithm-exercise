package string;

/**
 * @author mojo
 * @description: 学生出勤记录1
 * @date 2023/7/7 0007 21:09
 */
public class L551 {

    public static void main(String[] args) {

    }

    public boolean checkRecord(String s) {
        int a = 0;
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A') {
                a++;
                if (a >= 2) {
                    return false;
                }
            }
            if (c == 'L') {
                l++;
                if (l >= 3) {
                    return false;
                }
            } else {
                l = 0;
            }
        }
        return true;
    }

}
