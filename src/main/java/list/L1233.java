package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author mojo
 * @description: 删除子文件夹
 * @date 2023/2/8 0008 19:39
 */
public class L1233 {
    public static void main(String[] args) {
        String[] folder = {"/a","/a/b","/c/d","/c/d/e","/c/f"};
        System.out.println(new Solution1233().removeSubfolders(folder));
    }
}

class Solution1233 {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> list = new ArrayList<>();
        list.add(folder[0]);
        for (int i = 1; i < folder.length; ++i) {
            int last = list.get(list.size() - 1).length();
            int first = folder[i].length();
            if (last>=first ||
                    !(list.get(list.size()-1).equals(folder[i].substring(0,last)) && folder[i].charAt(last)=='/')){
                list.add(folder[i]);
            }
        }
        return list;
    }

    public List<String> removeSubfolders1(String[] folder) {
        Arrays.sort(folder);
        List<String> ans = new ArrayList<>();
        ans.add(folder[0]);
        for (int i = 1; i < folder.length; ++i) {
            int m = ans.get(ans.size() - 1).length();
            int n = folder[i].length();
            if (m >= n || !(ans.get(ans.size() - 1).equals(folder[i].substring(0, m)) && folder[i].charAt(m) == '/')) {
                ans.add(folder[i]);
            }
        }
        return ans;
    }
}