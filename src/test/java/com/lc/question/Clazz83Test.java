package com.lc.question;

import com.lc.util.ListNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by cmcc on 2019-12-17.
 */
@RunWith(Parameterized.class)
public class Clazz83Test {
    ListNode param1;
    public Clazz83Test(ListNode param1) {
        this.param1 = param1;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode((4));
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next=null;
        return Arrays.asList(new Object[][]{
                //set test case  {expect,param}
                {head}
        });
    }
    @Test
    public void deleteDuplicates() throws Exception {
        ListNode headR = new ListNode(1);
        ListNode node0R = new ListNode(2);
        ListNode node1R = new ListNode(4);
        headR.next = node0R;
        node0R.next = node1R;
        node1R.next = null;
        new Clazz83().deleteDuplicates(param1);
        assertEquals(headR,param1);
    }

}