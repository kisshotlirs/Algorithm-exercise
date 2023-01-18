package linkedList;

import java.util.Arrays;

/**
 * @author mojo
 * @description: 合并两个排序的链表
 * @date 2023/1/18 0018 11:59
 */
public class L21_O25 {
}

class Solution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prehead=new ListNode(-1);
        ListNode prev=prehead;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                prev.next=l1;
                l1=l1.next;
            }
            else{
                prev.next=l2;
                l2=l2.next;
            }
            prev=prev.next;
        }
        prev.next=l1==null? l2:l1;
        return prehead.next;
    }
}