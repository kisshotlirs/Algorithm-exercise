package stack;

import java.util.Stack;

/**
 * @author mojo
 * @description: 包含min函数的栈
 * @date 2023/1/20 0020 18:09
 */
public class L155_O30 {
    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(1);
        stack.push(-2);
        stack.push(3);
        stack.pop();
        System.out.println(stack);
    }
}

class MinStack {

    Stack<Integer> a,b;

    public MinStack() {
        a = new Stack<>();
        b = new Stack<>();
    }

    public void push(int x) {
        a.push(x);
        if (b.empty() || b.peek()>x){
            b.push(x);
        }
    }

    public void pop() {
        Integer pop = a.pop();
        if (pop.equals(b.peek())){
            b.pop();
        }
    }

    public int top() {
        return a.peek();
    }

    public int min() {
        return b.peek();
    }
}