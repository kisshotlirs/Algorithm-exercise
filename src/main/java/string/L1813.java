package string;

import java.util.Arrays;
import java.util.Objects;

/**
 * @author mojo
 * @description: 句子相似性3
 * @date 2023/1/16 0016 10:45
 */
public class L1813 {
    public static void main(String[] args) {
        String sentence1 = "my name is my name";
        String sentence2 = "my name";
        Solution1813 solution1813 = new Solution1813();
        System.out.println(solution1813.areSentencesSimilar(sentence1, sentence2));
    }
}

class Solution1813 {

    /**
     * 双指针
     * 提示：句子相似，一个句子必须是另一个句子的开头和结尾
     *      后半部分必须是相对应的部分，不然中间有空缺，相似失败
     */
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] s1 = sentence1.split(" ");
        String[] s2 = sentence2.split(" ");
        if (Arrays.equals(s1, s2)){
            return true;
        }

        int i = 0;
        int j = 0;
        while (i<s1.length && i<s2.length && Objects.equals(s1[i], s2[i])){
            i++;
        }
        while (j<s1.length-i && j<s2.length-i && s1[s1.length-j-1].equals(s2[s2.length-j-1])){
            j++;
        }
        return i+j==Math.min(s1.length,s2.length);
    }
}