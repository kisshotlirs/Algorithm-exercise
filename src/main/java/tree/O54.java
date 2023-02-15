package tree;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mojo
 * @description: 二叉搜索树的第k大节点
 * @date 2023/2/15 0015 12:34
 */
public class O54 {
    public static void main(String[] args) {

    }
}

class SolutionO54 {
    public int kthLargest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        TreeNode node = root;
        getNodeVal(node,list);
        return list.get(list.size()-k);
    }

    public void getNodeVal(TreeNode node,List<Integer> list){
        if (node==null){
            return;
        }
        getNodeVal(node.left,list);
        list.add(node.val);
        getNodeVal(node.right,list);
    }
}