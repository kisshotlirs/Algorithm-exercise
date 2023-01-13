package linkedList;

import java.util.ArrayList;

/**
 * @author mojo
 * @description: 链表的中间节点
 * @date 2023/1/13 0013 22:31
 */
public class L876 {
    public static void main(String[] args) {
        Solution876 solution876 = new Solution876();
        ListNode n5 = new ListNode(5,null);
        ListNode n4 = new ListNode(4,n5);
        ListNode n3 = new ListNode(3,n4);
        ListNode n2 = new ListNode(2,n3);
        ListNode n1 = new ListNode(1,n2);
        solution876.middleNode(n1);
        System.out.println(solution876.middleNode1(n1));
    }
}

class Solution876 {

    /**
     * 快慢指针
     */
    public ListNode middleNode1(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode middleNode(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<>();
        list.add(head);
        while (head.next!=null){
            list.add(head.next);
            head=head.next;
        }
        int count = list.size();
        return list.get(count/2);
    }
}