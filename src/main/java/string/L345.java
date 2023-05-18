package string;

import java.util.Arrays;

/**
 * @author: zyl
 * @description: 反转字符串中的元音字母
 */
public class L345 {

    public static void main(String[] args) {

    }

    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int l = 0,r = arr.length-1;
        while (l<r){
            while (l<arr.length && !isVowel(arr[l])){
                ++l;
            }
            while (r>0 && !isVowel(arr[r])){
                --r;
            }
            if (l < r){
                swap(arr,l,r);
                ++l;
                --r;
            }
        }
        return new String(arr);
    }

    private void swap(char[] arr, int l, int r) {
        char temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) >= 0;
    }
}
