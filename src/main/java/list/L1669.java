package list;

/**
 * @author mojo
 * @description: 合并两个链表
 * @date 2023/1/30 0030 20:19
 */
public class L1669 {
}

class Solution1669 {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode nodeA = list1;
        for (int i = 0; i < a-1; i++) {
            nodeA = nodeA.next;
        }
        ListNode nodeB = list1;
        for (int i = 0; i < b+1; i++) {
            nodeB = nodeB.next;
        }
        nodeA.next = list2;

        while (list2.next!=null){
            list2 = list2.next;
        }
        list2.next = nodeB;

        return list1;
    }
}