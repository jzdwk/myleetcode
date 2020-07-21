package com.lc.question;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by cmcc on 2019-12-09.
 */

@RunWith(Parameterized.class)
public class Clazz80Test {
    private int expect;
    private int[] param1;

    public Clazz80Test(int expect, int[] param1) {
        this.expect = expect;
        this.param1 = param1;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                //set test case  {expect,param}
                {5,new int[]{1,1,1,1,2,2,3,4}},
                //{7,new int[]{0,0,1,1,1,1,2,3,3}}
        });
    }

    @Test
    public void removeDuplicates() throws Exception {
        int rst = new Clazz80().removeDuplicates(param1);
        assertEquals(rst,expect);
        //assertArrayEquals(param1,new int[]{1,1,2,2,3});
    }

}