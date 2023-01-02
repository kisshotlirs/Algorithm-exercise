package string;

/**
 * @author mojo
 * @description: 最后一个单词的长度
 * @date 2023/1/2 0002 21:34
 */
public class L58 {
    public static void main(String[] args) {
        String s = "hello world ";
        Solution solution = new Solution();
        solution.lengthOfLastWord(s);
    }
}

class Solution {
    public int lengthOfLastWord(String s) {
        //挪动到最后一个字母的位置
        int index = s.length()-1;
        while(s.charAt(index) == ' '){
            index--;
        }

        int length = 0;
        while (index>=0 && s.charAt(index) != ' '){
            index--;
            length++;
        }
        return length;
    }
}