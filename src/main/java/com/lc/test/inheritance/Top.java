package com.lc.test.inheritance;

/**
 * Created by cmcc on 2020-06-28.
 */
public abstract class Top {
    String msg;

    public Top(String msg) {
        System.out.println("this is top");
        this.msg = msg;
    }

    protected abstract String getMsg();

}
