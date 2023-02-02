package tree;

import java.util.Stack;

/**
 * @author mojo
 * @description: 二叉搜索树的后序遍历序列
 * @date 2023/2/2 0002 20:16
 */
public class O33 {
    public static void main(String[] args) {
        int[] num = {1,3,2,6,5};
        System.out.println(new SolutionO33().verifyPostorder(num));
    }
}

class SolutionO33 {
    public boolean verifyPostorder(int[] postorder) {
        Stack<Integer> stack = new Stack<>();
        int root = Integer.MAX_VALUE;
        for (int i = postorder.length-1;i >= 0; i--) {
            if (postorder[i]>root){
                return false;
            }
            while (!stack.isEmpty() && stack.peek()>postorder[i]){
                root = stack.pop();
            }
            stack.add(postorder[i]);
        }
        return true;
    }
}