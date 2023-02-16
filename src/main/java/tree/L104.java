package tree;

import list.ListNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author mojo
 * @description: 二叉树的深度
 * @date 2023/2/16 0016 19:11
 */
public class L104 {
    public static void main(String[] args) {
        TreeNode n4 = new TreeNode(7);
        TreeNode n3 = new TreeNode(9);
        TreeNode n2 = new TreeNode(20);
        TreeNode n1 = new TreeNode(3);
        n1.left = n2; n1.right = n3;
        n2.left = null; n2.right = null;
        n3.left = null; n3.right = n4;
        System.out.println(new Solution104().maxDepth(n1));
    }
}

class Solution104 {
    public int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int res = 0;
        while (!queue.isEmpty()){
            res++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left!=null){
                    queue.add(node.left);
                }
                if (node.right!=null){
                    queue.add(node.right);
                }
            }
        }
        return res;
    }

}