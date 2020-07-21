package com.lc.question;

import com.lc.util.ListNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by cmcc on 2019-12-19.
 */

@RunWith(Parameterized.class)
public class Clazz86Test {
    ListNode param1;
    private int x;
    public Clazz86Test(ListNode param1, int x) {
        this.param1 = param1;
        this.x = x;
    }

    @Test
    public void partition() throws Exception {
        ListNode rst = new Clazz86().partition(param1,x);
        assertEquals(rst,null);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        //param
        ListNode head = new ListNode(2);
        ListNode node2 = new ListNode(1);
        head.next = node2;
        node2.next = null;
        /*   node3 = new ListNode(3);
        ListNode node4 = new ListNode((2));
        ListNode node5 = new ListNode((2));
        ListNode node6 = new ListNode((3));*/
       /* head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = null;*/
        return Arrays.asList(new Object[][]{
                //set test case  {expect,param}
                {head,2}
        });
    }

}