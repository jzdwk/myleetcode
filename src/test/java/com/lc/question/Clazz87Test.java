package com.lc.question;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by cmcc on 2019-12-20.
 */

@RunWith(Parameterized.class)
public class Clazz87Test {
    private boolean expect;
    private String param1;
    private String param2;



    public Clazz87Test( boolean expect,String param1, String param2) {
        this.param2 = param2;
        this.param1 = param1;
        this.expect = expect;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                //set test case  {expect,param}
                {true,"great","rgeat"},
                {false,"abcde","caebd"}
        });
    }

    @Test
    public void isScramble() throws Exception {
        boolean rst = new Clazz87().isScramble(param1,param2);
        assertEquals(rst,expect);
    }

}