package string;

/**
 * @author mojo
 * @description: 罗马数字转整数
 * @date 2023/1/3 0003 10:08
 */
public class L13 {
    public static void main(String[] args) {
        Solution13 solution13 = new Solution13();
        String s = "IIV";
        solution13.romanToInt(s);
    }
}

class Solution13 {
    public int romanToInt(String s) {
        int sum = 0;
        int pre = getValue(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (pre < getValue(s.charAt(i))){
                sum = sum - pre;
            } else {
                sum = sum + pre;
            }
            pre = getValue(s.charAt(i));
        }
        sum = sum+pre;
        return sum;
    }

    private int getValue(char ch) {
        switch (ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}