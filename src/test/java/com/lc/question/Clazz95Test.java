package com.lc.question;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by cmcc on 2020-01-15.
 */

@RunWith(Parameterized.class)
public class Clazz95Test {
    int param1;

    public Clazz95Test(int param1) {
        this.param1 = param1;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                //set test case  {expect,param}
                {4}
        });
    }

    @Test
    public void generateTrees() throws Exception {
        List rst = new Clazz95().generateTrees(param1);

    }
}