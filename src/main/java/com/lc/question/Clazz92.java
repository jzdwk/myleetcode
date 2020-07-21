package com.lc.question;

import com.lc.util.ListNode;

/**
 * Created by cmcc on 2019-12-26.
 */
public class Clazz92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null) return head;
        if (m==n) return head;
        ListNode preHead = new ListNode(-999);
        preHead.next = head;
        ListNode pre = preHead;
        for (int i = 0; i < m-1; i++) {
            if (pre != null) pre = pre.next;
        }
        ListNode cur2 = pre.next;
        ListNode cur;
        for (int i = m; i<n;i++){
            cur = cur2.next;
            cur2.next = cur.next;
            cur.next = pre.next;
            pre.next = cur;
        }
        return preHead.next;
    }
}
