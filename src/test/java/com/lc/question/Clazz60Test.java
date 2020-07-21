package com.lc.question;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by cmcc on 2019-11-21.
 */
@RunWith(Parameterized.class)
public class Clazz60Test {
    private static Clazz60 c60 = new Clazz60();
    private String expect;
    private int m;
    private int k;


    public Clazz60Test(String expect, int m, int k) {
        this.expect = expect;
        this.m = m;
        this.k = k;
    }

    @Parameterized.Parameters
    public static Collection testData(){
        return Arrays.asList(new Object[][]{
            {"213", 3,3},
                {"1",0,0}
        });
    }
    @Test
    public void getPermutation() throws Exception {
        String rst = c60.getPermutation(m,k);
        assertEquals(expect,rst);

    }

}