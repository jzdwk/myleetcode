package com.lc.question;

import com.lc.util.ListNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by cmcc on 2019-12-13.
 */
public class Clazz82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode headHead = new ListNode(-1);
        ListNode pre = headHead;
        headHead.next = head;
        while (head != null && head.next!=null){
            if (head.val != head.next.val){
                pre = head;
                head = head.next;
            }else{
                while (head != null&&head.next != null&&head.val == head.next.val){
                    head = head.next;
                }
                if (head == null){
                    pre.next = null;
                }else{
                    pre.next = head.next;
                    head = head.next;
                }
            }
        }
        return headHead.next;
    }
}
