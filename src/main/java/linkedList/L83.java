package linkedList;

/**
 * @author mojo
 * @description: 删除排序链表中的重复元素
 * @date 2023/1/1 0001 11:33
 */
public class L83 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node = new ListNode(2,node1);
        ListNode head = new ListNode(1,node);

        Solution solution = new Solution();
        solution.deleteDuplicates(head);
    }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null){
            return head;
        }

        ListNode cur = head;
        while (cur.next!=null){
            if (cur.val == cur.next.val){
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }
}