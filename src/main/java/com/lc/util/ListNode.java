package com.lc.util;

/**
 * Created by cmcc on 2019-11-19.
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }

    @Override
    public boolean equals(Object head) {
        ListNode current = this;
        if (head instanceof ListNode){
            while (current!=null&&head!=null){
                if (current.val != ((ListNode) head).val) return false;
                current = current.next;
                head = ((ListNode) head).next;
            }
            if (head!=null) return false;
        }
        return true;
    }
}
