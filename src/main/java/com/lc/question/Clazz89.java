package com.lc.question;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmcc on 2019-12-23.
 */
public class Clazz89 {
    public List<Integer> grayCode(int n) {
        List<Integer> gray = new ArrayList<Integer>();
        gray.add(0); //初始化 n = 0 的解
        for (int i = 0; i < n; i++) {
            int add = 1 << i; //要加的数
            //倒序遍历，并且加上一个值添加到结果中
            for (int j = gray.size() - 1; j >= 0; j--) {
                gray.add(gray.get(j) + add);
            }
        }
        return gray;
    }

}
