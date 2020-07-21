package com.lc.question;

import com.lc.util.ListNode;

/**
 * Created by cmcc on 2019-12-19.
 */
public class Clazz86 {
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;
        // 1-4-5-2-5-2  x = 3
        ListNode pre = new ListNode(-9999);
        pre.next = head;
        ListNode stt = pre;
        //get start
        while (stt.next!=null){
            if (stt.next.val>=x){
                break;
            }
            stt = stt.next;
        }
        //如果stt没动，说明在队头，直接返回
        if (stt == pre) return pre.next;
        ListNode p = stt.next;
        // if p ==null 说明在队尾, 直接返回
        if (p == null) return pre.next;
        while(p.next!=null){
            if (p.next.val < x){
                //delete
                ListNode temp = p.next;
                p.next = temp.next;
                //insert
                temp.next = stt.next;
                stt.next = temp;
                stt = stt.next;
            }else{
                p = p.next;
            }
        }
        return pre.next;
    }
}
