package linkedList;

import java.util.HashMap;

/**
 * @author: zyl
 * @description: 复杂链表的复制
 */
public class L138 {
}

class Solution138 {
    public Node copyRandomList(Node head) {
        if (head == null){
            return null;
        }
        Node cur = head;
        //复制到新的链表
        HashMap<Node, Node> map = new HashMap<>();
        while (cur != null){
            map.put(cur,new Node(cur.val));
            cur = cur.next;
        }

        //重新指向头节点
        cur = head;
        //构建新链表的next和random
        while (cur != null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        //返回新链表的头
        return map.get(head);
    }
}