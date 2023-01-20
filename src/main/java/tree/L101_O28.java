package tree;

/**
 * @author mojo
 * @description: 对称的二叉树
 * @date 2023/1/20 0020 10:59
 */
public class L101_O28 {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(2);
        TreeNode t5 = new TreeNode(3);
        TreeNode t7 = new TreeNode(3);
        t1.left = t2; t1.right = t3;
        t2.left = null; t2.right = t5;
        t3.left = null; t3.right = t7;
        Solution101 solution101 = new Solution101();
        System.out.println(solution101.isSymmetric(t1));
    }
}

class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        if (root==null){
            return true;
        }
        return recur(root.left,root.right);
    }

    private boolean recur(TreeNode l, TreeNode r) {
        if (l==null && r==null){
            return true;
        }
        if (l==null || r==null || l.val!=r.val){
            return false;
        }
        return recur(l.left,r.right) && recur(r.left,l.right);
    }


}