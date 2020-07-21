package com.lc.test.inheritance;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by cmcc on 2020-06-25.
 */
public class MyHashSet<E> extends HashSet<E> {
    int count;

    public MyHashSet() {
        this.count = 0;
    }

    public boolean add(E e){
        count++;
        return super.add(e);
    }

/*    public boolean addAll(Collection<? extends E> c){
        count += c.size();
        return super.addAll(c);
    }*/

    public static void main(String[] args) {
        //基于实现继承带来的问题
        MyHashSet my = new MyHashSet();
        my.addAll(Arrays.asList("a","b","c"));
        System.out.println(my.count);
    }
}
