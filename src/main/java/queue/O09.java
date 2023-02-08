package queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * @author mojo
 * @description: 用两个栈实现队列
 * @date 2023/2/8 0008 18:17
 */
public class O09 {
}

class CQueue {

    Stack<Integer> s1;
    Stack<Integer> s2;

    public CQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void appendTail(int value) {
        s1.push(value);
    }

    public int deleteHead() {
        if (s2.isEmpty()){
            if (s1.isEmpty()){
                return -1;
            }
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
}
