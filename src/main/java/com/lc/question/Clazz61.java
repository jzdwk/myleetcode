package com.lc.question;

import com.lc.util.ListNode;

/**
 * Created by cmcc on 2019-11-19.
 */
public class Clazz61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        int length = 1;
        ListNode p = head;
        while (p.next !=null) {
            length++;
            p = p.next;
        }
        k = k%length;
        for (int i = 0; i <k ; i++) {
            head = doRotateRightOne(head);
        }
        return head;
    }
    //每次右移动一格
    private ListNode doRotateRightOne(ListNode head){
        ListNode p = head;
        ListNode c ;
        while (p.next.next != null){
            p = p.next;
        }
        c = p.next;
        p.next = null;
        c.next = head;
        return c;
    }
}
