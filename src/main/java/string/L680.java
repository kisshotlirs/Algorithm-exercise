package string;

/**
 * @author: zyl
 * @description: 验证回文串
 */
public class L680 {

    public static void main(String[] args) {

    }

    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        while (l<r){
            char a = s.charAt(l);
            char b = s.charAt(r);
            if (a==b){
                l++;
                r--;
            } else {
                return valid(s,l+1,r) || valid(s,l,r-1);
            }
        }
        return true;
    }

    public boolean valid(String s,int l,int r){
        for (int i=l,j=r ; i<j ; i++,j--){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
