package linkedList;

/**
 * @author mojo
 * @description: 二进制链表转整数
 * @date 2023/1/13 0013 23:02
 */
public class L1290 {
    public static void main(String[] args) {
        ListNode n3 = new ListNode(1,null);
        ListNode n2 = new ListNode(0,n3);
        ListNode n1 = new ListNode(1,n2);
        Solution1290 solution1290 = new Solution1290();
        System.out.println(solution1290.getDecimalValue(n1));
    }
}

class Solution1290 {
    public int getDecimalValue(ListNode head) {
        StringBuffer s = new StringBuffer();
        while (head!=null){
            s.append(head.val);
            head = head.next;
        }
        return Integer.parseInt(s.toString(),2);
    }
}