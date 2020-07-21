package com.lc.question;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by cmcc on 2019-11-25.
 */

@RunWith(Parameterized.class)
public class Clazz69Test {
    private int expect;
    private int param;
    private Clazz69 c69 = new Clazz69();

    public Clazz69Test(int expect, int param) {
        this.expect = expect;
        this.param = param;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                //set test case  {expect,param}
                {2,5}
        });
    }


    @Test
    public void mySqrt() throws Exception {
        assertEquals(expect,c69.mySqrt(param));
    }

}