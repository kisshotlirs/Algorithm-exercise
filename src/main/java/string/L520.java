package string;

/**
 * @author: zyl
 * @description: 检测大写字母
 */
public class L520 {

    public static void main(String[] args) {
        String s = "FlaG";
        System.out.println(new L520().detectCapitalUse(s));
    }

    public boolean detectCapitalUse(String word) {
        int count = 0;
        int local = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                count++;
                local = i;
            }
        }
        if ( (count == 1 && local == 0) || (count == word.length() && local == word.length()-1) || count == 0 ) {
            return true;
        }
        return false;
    }
}
