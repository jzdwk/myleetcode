package com.lc.question;

import com.lc.util.ListNode;

/**
 * Created by cmcc on 2019-12-17.
 */
public class Clazz83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = new ListNode(-1);
        ListNode pre = p;
        ListNode q = head;
        p.next = q;
        while(q!=null){
            if (p.val!=q.val){
                p.next = q;
                q = q.next;
                p = p.next;
            }else{
                q = q.next;
            }
        }
        p.next = q;
        return pre.next;
    }
}
