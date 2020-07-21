package com.lc.question;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by cmcc on 2019-11-29.
 */
@RunWith(Parameterized.class)
public class Clazz71Test {
    private int expect;
    private String param1;
    private String param2;

    public Clazz71Test(int expect, String param1, String param2) {
        this.expect = expect;
        this.param1 = param1;
        this.param2 = param2;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                //set test case  {expect,param}
                {3,"horse","ros"},
                {5,"intention","execution"}
        });
    }


    @Test
    public void minDistance() throws Exception {
        int rst = new Clazz71().minDistance(param1,param2);
        assertEquals(expect,rst);
    }

}