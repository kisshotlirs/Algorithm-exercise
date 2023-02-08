package list;

/**
 * @author mojo
 * @description: 删除链表的节点
 * @date 2023/1/16 0016 11:46
 */
public class O18 {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(4);
        ListNode n2 = new ListNode(5);
        ListNode n3 = new ListNode(1);
        ListNode n4 = new ListNode(9);
        n1.next = n2; n2.next = n3; n3.next=n4; n4.next=null;
        SolutionO18 solutionO18 = new SolutionO18();
        System.out.println(solutionO18.deleteNode(n1, 5).val);
    }
}

class SolutionO18 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head.val==val){
            return head.next;
        }

        ListNode pre = head;
        ListNode cur = head.next;
        while (cur!=null && cur.val!=val){
            pre=cur;
            cur=cur.next;
        }
        pre.next = cur.next;
        return head;
    }
}