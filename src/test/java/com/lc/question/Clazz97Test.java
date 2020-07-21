package com.lc.question;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by cmcc on 2020-01-19.
 */
@RunWith(Parameterized.class)
public class Clazz97Test {
    private boolean expect;
    private String param1;
    private String param2;
    private String param3;

    public Clazz97Test(boolean expect, String param1, String param2, String param3) {
        this.expect = expect;
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
    }

    @Test
    public void isInterleave() throws Exception {
        boolean rst = new Clazz97().isInterleave(param1,param2,param3);
        assertEquals(rst,expect);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                //set test case  {expect,param}
                {true,"ab","ac","abac"},
                {true,"aabcc","dbbca","aadbbcbcac"},
                {false,"aabcc","dbbca","aadbbbaccc"}
        });
    }
}