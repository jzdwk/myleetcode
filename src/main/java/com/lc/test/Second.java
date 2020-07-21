package com.lc.test;

/**
 * Created by cmcc on 2020-06-28.
 */
public class Second extends Top {

    public Second(String msg) {
        super(msg);
        System.out.println("this is second");

    }

    public String getMsg(){
        return super.msg + " second";
    }
    public static void main(String[] args) {
        Top top = new Second("test");
        test(top);
    }

    private static void test(Top t){
        System.out.println(t.getMsg());
    }
}
