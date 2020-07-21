package com.lc.question;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by cmcc on 2019-11-29.
 */
@RunWith(Parameterized.class)
public class Clazz72Test {
    private int[][] expect;
    private int[][] param;

    public Clazz72Test(int[][] expect, int[][] param) {
        this.expect = expect;
        this.param = param;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                //set test case  {expect,param}
                {
                        new int[][]{
                                {0,0,0,0}
                                ,{0,4,5,0}
                                ,{0,3,1,0}},
                    new int[][]{
                            {0,1,2,0},
                            {3,4,5,2},
                            {1,3,1,5}}

                }
        });
    }

    @Test
    public void setZeroes() throws Exception {
        new Clazz72().setZeroes(param);
        assertArrayEquals(expect,param);
    }

}