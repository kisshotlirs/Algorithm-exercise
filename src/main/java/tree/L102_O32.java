package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author mojo
 * @description: 从上到下打印二叉树 II
 * @date 2023/1/22 0022 12:24
 */
public class L102_O32 {
    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(9);
        TreeNode n3 = new TreeNode(20);
        TreeNode n6 = new TreeNode(15);
        TreeNode n7 = new TreeNode(7);
        n1.left=n2; n1.right=n3;
        n2.left=null; n2.right=null;
        n3.left=n6; n3.right=n7;
        Solution102 solution102 = new Solution102();
        System.out.println(solution102.levelOrder(n1));
    }
}

class Solution102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> list = new ArrayList<>();;
        Queue<TreeNode> queue = new LinkedList<>();
        if (root!=null){
            queue.add(root);
        }
        while (!queue.isEmpty()){
            ArrayList<Integer> tmp = new ArrayList<>();
            for (int i= queue.size();i>0;i--){
                TreeNode node = queue.poll();
                tmp.add(node.val);
                if (node.left!=null){
                    queue.add(node.left);
                }
                if (node.right!=null){
                    queue.add(node.right);
                }
            }
            list.add(tmp);
        }
        return list;
    }
}