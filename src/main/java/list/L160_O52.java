package list;

import java.util.HashSet;

/**
 * @author mojo
 * @description: 两个链表的第一个公共节点
 * @date 2023/2/10 0010 19:43
 */
public class L160_O52 {
}

class SolutionL160 {
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode temp = headA;
        while (temp!=null){
            set.add(temp);
            temp = temp.next;
        }
        temp = headB;
        while (temp!=null){
            if (set.contains(temp)){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
}