package tree;

/**
 * @author mojo
 * @description: 二叉树的镜像
 * @date 2023/1/19 0019 14:25
 */
public class L226_O27 {
    public static void main(String[] args) {
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(7);
        TreeNode n = new TreeNode(4);
        n.left = n2;
        n.right = n3;
        Solution226 solution226 = new Solution226();
        TreeNode treeNode = solution226.mirrorTree(n);
        System.out.println(treeNode.left.val);
        System.out.println(treeNode.right.val);
    }
}

class Solution226 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode leftRoot = mirrorTree(root.right);
        TreeNode rightRoot = mirrorTree(root.left);
        root.left = leftRoot;
        root.right = rightRoot;
        return root;
    }
}