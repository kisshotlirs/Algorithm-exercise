package array;

/**
 * @author mojo
 * @description: 寻找比目标字母大的最小字母
 * @date 2023/8/9 0009 20:24
 */
public class L744 {

    public char nextGreatestLetter(char[] letters, char target) {
        for (char letter : letters) {
            if (letter > target) {
                return letter;
            }
        }
        return letters[0];
    }
}
