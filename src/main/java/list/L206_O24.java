package list;

import java.util.Stack;

/**
 * @author mojo
 * @description: 反转链表
 * @date 2023/1/18 0018 11:12
 */
public class L206_O24 {
}

class Solution206 {
    public ListNode reverseList1(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while (cur!=null){
            ListNode n = cur;
            cur.next = pre;
            pre = n;
            cur = cur.next;
        }
        return pre;
    }

    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        while (head!=null){
            stack.push(head);
            head = head.next;
        }

        ListNode cur = stack.pop();
        cur.next = null;
        while (!stack.empty()){
            cur.next = stack.pop();
            cur = cur.next;
            cur.next = null;
        }
        return cur;
    }
}