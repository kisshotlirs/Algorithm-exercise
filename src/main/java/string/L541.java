package string;

/**
 * @author mojo
 * @description: TODO
 * @date 2023/7/3 0003 19:16
 */
public class L541 {

    public String reverseStr(String s, int k) {
        int index = 0;
        StringBuilder res = new StringBuilder();
        int len = s.length();
        while (index < len) {
            int end = Math.min(index+k, len);
            StringBuilder temp = new StringBuilder(s.substring(index, end));
            if ((index/k)%2 == 0) {
                res.append(temp.reverse());
            } else {
                res.append(temp);
            }
            index = end;
        }
        return res.toString();
    }

}

