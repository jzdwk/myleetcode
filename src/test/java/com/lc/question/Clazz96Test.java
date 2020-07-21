package com.lc.question;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by cmcc on 2020-01-15.
 */

@RunWith(Parameterized.class)
public class Clazz96Test {
    int expect;
    int parm1;


    public Clazz96Test(int expect, int parm1) {
        this.expect = expect;
        this.parm1 = parm1;

    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                //set test case  {expect,param}
                {5,3}
        });
    }

    @Test
    public void numTrees() throws Exception {
        int rst = new Clazz96().numTrees(parm1);
        assertEquals(rst,expect);
    }

}