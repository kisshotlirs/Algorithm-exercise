package string;

/**
 * @author: zyl
 * @description: 交替合并字符串
 */
public class L1768 {
}

class Solution1768 {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        StringBuffer res = new StringBuffer();
        int i = 0;
        while (i < l1 || i < l2){
            if (i < l1){
                res.append(word1.charAt(i));
            }
            if (i < l2){
                res.append(word2.charAt(i));
            }
            i++;
        }
        return res.toString();
    }
}