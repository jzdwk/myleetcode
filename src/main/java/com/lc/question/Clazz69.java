package com.lc.question;

/**
 * Created by cmcc on 2019-11-25.
 */
public class Clazz69 {
    public int mySqrt(int x) {
        long r = x;
        while(r*r > x) r = (r + x/r) / 2;
        return (int)r;
    }
}
