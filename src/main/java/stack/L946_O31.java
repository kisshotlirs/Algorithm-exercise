package stack;

import java.util.Stack;

/**
 * @author mojo
 * @description: 栈的压入、弹出序列
 * @date 2023/1/21 0021 21:02
 */
public class L946_O31 {
    public static void main(String[] args) {
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,5,3,2,1};
        Solution946 solution946 = new Solution946();
        System.out.println(solution946.validateStackSequences(pushed, popped));
    }
}

class Solution946 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for (int num : pushed) {
            stack.push(num);
            while (!stack.empty() && stack.peek()==popped[i]){
                stack.pop();
                i++;
            }
        }
        return stack.empty();
    }
}