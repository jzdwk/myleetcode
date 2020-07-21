package com.lc.question;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by cmcc on 2019-11-27.
 */
@RunWith(Parameterized.class)
public class Clazz70Test {

    private String expect;
    private String param;

    public Clazz70Test(String expect, String param) {
        this.expect = expect;
        this.param = param;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                //set test case  {expect,param}
                {"/c","/a/../../b/../c//.//"},
                {"/c","/a/./b/../../c/"},
                {"/home/foo","/home//foo/"}
        });
    }
    @Test
    public void simplifyPath() throws Exception {
        String rst = new Clazz70().simplifyPath(param);
        assertEquals(expect,rst);
    }

}