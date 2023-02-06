package tree;

/**
 * @author mojo
 * @description: 计算布尔二叉树的值
 * @date 2023/2/6 0006 20:22
 */
public class L2331 {
}

class Solution2331 {
    public boolean evaluateTree(TreeNode root) {
        if (root.left==null){
            return root.val==1;
        }
        if (root.val==2){
            return evaluateTree(root.left) || evaluateTree(root.right);
        } else {
            return evaluateTree(root.right) && evaluateTree(root.left);
        }
    }
}