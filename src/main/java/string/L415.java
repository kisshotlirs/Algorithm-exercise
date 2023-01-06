package string;

/**
 * @author mojo
 * @description: TODO
 * @date 2023/1/6 0006 12:27
 */
public class L415 {
    public static void main(String[] args) {
        Solution415 solution415 = new Solution415();
        String s1 = "99";
        String s2 = "9";
        String s = solution415.addStrings(s1, s2);
        System.out.println(s);
    }
}

class Solution415 {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;
        int add=0;
        StringBuffer stringBuffer = new StringBuffer();

        while (i>=0 || j>=0 || add!=0){
            int x = 0;
            int y = 0;

            if (i>=0){
                x = num1.charAt(i)-'0';
            }
            if (j>=0){
                y = num2.charAt(j)-'0';
            }

            stringBuffer.append((x+y+add)%10);
            add = (x+y+add)/10;
            i--;
            j--;
        }
        return stringBuffer.reverse().toString();
    }
}
