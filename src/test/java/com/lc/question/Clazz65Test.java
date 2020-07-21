package com.lc.question;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by cmcc on 2019-11-25.
 */
@RunWith(Parameterized.class)
public class Clazz65Test {
   private int[] expect;
   private int[] param;
   private Clazz65 c65 = new Clazz65();

    public Clazz65Test(int[] expect, int[] param) {
        this.expect = expect;
        this.param = param;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
               /* {new int[]{1,2,3},new int[]{1,2,2}},
                {new int[]{2,0},new int[]{1,9}},
                {new int[]{1,0},new int[]{9}},*/
                {new int[]{1,0,0,0},new int[]{9,9,9}}
        });
    }

    @Test
    public void minPathSum() throws Exception {
        int[] rst = c65.plusOne(param);
        assertArrayEquals(expect,rst);
    }


}