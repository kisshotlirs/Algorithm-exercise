package linkedList;

import java.util.ArrayList;

/**
 * @author mojo
 * @description: 回文链表
 * @date 2023/1/13 0013 22:04
 */
public class L234 {
    public static void main(String[] args) {
        Solution234 solution234 = new Solution234();
        ListNode n4 = new ListNode(1,null);
        ListNode n3 = new ListNode(2,n4);
        ListNode n2 = new ListNode(2,n3);
        ListNode n1 = new ListNode(1,n2);
        System.out.println(solution234.isPalindrome(n1));
    }
}

class Solution234 {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 1;
        list.add(head.val);
        while (head.next!=null){
            list.add(head.next.val);
            head = head.next;
            count++;
        }

        for (int i = 0; i < count; i++) {
            if (!list.get(i).equals(list.get(count - i - 1))){
                return false;
            }
        }
        return true;
    }
}