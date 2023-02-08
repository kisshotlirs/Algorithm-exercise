package list;

/**
 * @author mojo
 * @description: 链表中倒数第k个节点
 * @date 2023/1/18 0018 10:48
 */
public class O22 {
}

class SolutionO22 {

    /**
     * 不需要知道链表长度，指针1先走k-1步，然后指针2和指针1同时前进，当指针1指向链表最后一个元素时，指针2即为所求。
     */
    public ListNode getKthFromEnd1(ListNode head, int k) {
        ListNode former = head, latter = head;
        for(int i = 0; i < k; i++) {
            former = former.next;
        }
        while(former != null) {
            former = former.next;
            latter = latter.next;
        }
        return latter;
    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        int count = 0;
        ListNode cur = null;
        for (cur=head ; cur!=null ; cur=cur.next){
            count++;
        }

        for (int i = 0; i < count-k+1; i++) {
            if (head!=null){
                head = head.next;
            }
        }
        return head;
    }
}