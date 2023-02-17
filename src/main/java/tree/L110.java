package tree;

/**
 * @author mojo
 * @description: 平衡二叉树
 * @date 2023/2/17 0017 10:40
 */
public class L110 {
    public static void main(String[] args) {
        TreeNode n4 = new TreeNode(7);
        TreeNode n3 = new TreeNode(9);
        TreeNode n2 = new TreeNode(20);
        TreeNode n1 = new TreeNode(3);
        n1.left = n2; n1.right = n3;
        n3.right = n4;
        System.out.println(new Solution110().isBalanced(n1));
    }
}

class Solution110 {
    public boolean isBalanced(TreeNode root) {
        return recur(root)!=-1;
    }

    public int recur(TreeNode node){
        if (node==null){
            return 0;
        }
        int l = recur(node.left);
        if (l == -1){
            return -1;
        }
        int r = recur(node.right);
        if (r == -1){
            return -1;
        }
        return Math.abs(l-r) <2 ? Math.max(l,r)+1 : -1;
    }
}