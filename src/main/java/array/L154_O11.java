package array;


/**
 * @author mojo
 * @description: 旋转数组的最小数字 LeetCode154 剑指Offer11
 * @date 2023/1/15 0015 11:37
 */
public class L154_O11 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int minArray(int[] numbers) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int m = (i + j) / 2;
            if (numbers[m] > numbers[j]) {
                i = m + 1;
            } else if (numbers[m] < numbers[j]) {
                j = m;
            } else {
                j--;
            }
        }
        return numbers[i];
    }
}