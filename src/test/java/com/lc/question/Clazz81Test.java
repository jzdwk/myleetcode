package com.lc.question;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by cmcc on 2019-12-13.
 */

@RunWith(Parameterized.class)
public class Clazz81Test {
    private boolean expect;
    private int param1;
    private int[] param2;

    public Clazz81Test(boolean expect, int param1, int[] param2) {
        this.expect = expect;
        this.param1 = param1;
        this.param2 = param2;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                //set test case  {expect,param}
               // {true,0,new int[]{2,5,6,0,0,1,2}},
                {true,1,new int[]{3,1}},
               // {true,3,new int[]{1,3,1,1,1}},
               // {false,0,new int[]{1,2,1}}

        });
    }

    @Test
    public void search() throws Exception {
        boolean rst = new Clazz81().search(param2,param1);
        assertEquals(expect,rst);
    }
}