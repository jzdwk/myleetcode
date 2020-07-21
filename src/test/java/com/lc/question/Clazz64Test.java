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
public class Clazz64Test {

    private static Clazz64 c64 = new Clazz64();
    private int expect;
    private int[][] param;

    public Clazz64Test(int expect, int[][] param) {
        this.expect = expect;
        this.param = param;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {7,new int[][]{
                {1,3,1},
                {1,5,1},
                {4,2,1}}},{
                3,new int[][]{
                {1,2},
                {1,1}
                }
        }});
    }

    @Test
    public void minPathSum() throws Exception {
        int rst = c64.minPathSum(param);
        assertEquals(expect,rst);
    }

}