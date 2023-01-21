package tree;

/**
 * @author mojo
 * @description: 从上到下打印二叉树
 * @date 2023/1/21 0021 22:58
 */
public class O32 {
    public static void main(String[] args) {
        SolutionO32 solutionO32 = new SolutionO32();

    }
}

class SolutionO32 {
    int[] res = null;
    int i = 1;
    public int[] levelOrder(TreeNode root) {
        res[0] = root.val;
        return res;
    }

    public void printTree(TreeNode l,TreeNode r){
        if (l!=null){
            res[i++] = l.val;
        }
        if (r!=null){
            res[i++] = r.val;
        }
        printTree(l.left,l.right);
        printTree(r.left,r.right);
    }
}