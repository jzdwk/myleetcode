package com.lc.question;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by cmcc on 2019-12-31.
 */

@RunWith(Parameterized.class)
public class Clazz93Test {
    private String param;
    private List<String> expect;

    public Clazz93Test(List<String> expect,String param) {
        this.param = param;
        this.expect = expect;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        List<String> rst = new ArrayList<String>();
        rst.add("255.255.111.35");
        rst.add("255.255.11.135");
        return Arrays.asList(new Object[][]{
                //set test case  {expect,param}
                {rst,"25525511135"}
        });
    }

    @Test
    public void restoreIpAddresses() throws Exception {
        List rst = new Clazz93().restoreIpAddresses(param);
        assertEquals(expect,rst);
    }

}