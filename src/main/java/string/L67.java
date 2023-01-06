package string;

/**
 * @author mojo
 * @description: 二进制求和
 * @date 2023/1/6 0006 20:17
 */
public class L67 {
    public static void main(String[] args) {
        Solution67 solution67 = new Solution67();
        String a = "101";
        String b = "10101";
        String s = solution67.addBinary(a, b);
        String s1 = solution67.addBinary2(a, b);
        System.out.println(s);
        System.out.printf("s1: "+s1);
    }
}

class Solution67 {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        int add = 0;
        StringBuffer stringBuffer = new StringBuffer();

        while (i>=0 || j>=0 || add!=0){
            int x=0;
            int y=0;

            if (i>=0){
                x=a.charAt(i)-'0';
            }
            if (j>=0){
                y=b.charAt(j)-'0';
            }
            stringBuffer.append((x+y+add)%2);
            add=(x+y+add)/2;
            i--;
            j--;
        }
        return stringBuffer.reverse().toString();
    }

    public String addBinary2(String a,String b){
        return Integer.toBinaryString(Integer.parseInt(a,2)+Integer.parseInt(b,2));
    }
}