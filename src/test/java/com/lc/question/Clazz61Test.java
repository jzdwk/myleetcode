package com.lc.question;

import com.lc.util.ListNode;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

/**
 * Created by cmcc on 2019-11-21.
 */

public class Clazz61Test {
    ListNode head;
    ListNode node2;
    ListNode node3;

    ListNode head2;
    ListNode node22;
    ListNode node23;
    @Before
    public void init(){
        head = new ListNode(1);
        node2 = new ListNode(2);
        node3 = new ListNode(3);
        head.next = node2;
        node2.next = node3;
        node3.next = null;

        head2 = new ListNode(3);
        node22 = new ListNode(1);
        node23 = new ListNode(2);
        head2.next = node22;
        node22.next = node23;
        node23.next = null;
    }

    @Test
    public void rotateRight() throws Exception {
        assertEquals(head2,new Clazz61().rotateRight(head,1));
    }

}