package string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @author mojo
 * @description: 字符串的排列
 * @date 2023/2/10 0010 19:23
 */
public class O38 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new SolutionO38().permutation("abc")));
    }
}

class SolutionO38 {

    List<String> list = new LinkedList<>();
    char[] c;

    public String[] permutation(String s) {
        c = s.toCharArray();
        dfs(0);
        return list.toArray(new String[list.size()]);
    }

    public void dfs(int x){
        if (x == c.length-1){
            list.add(String.valueOf(c));
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for (int i=x ; i<c.length ; i++){
            if (set.contains(c[i])) {
                continue;
            }
            set.add(c[i]);
            swap(i,x);
            dfs(x+1);
            swap(i,x);
        }
    }

    private void swap(int x, int y) {
        char tmp = c[x];
        c[x] = c[y];
        c[y] = tmp;
    }
}