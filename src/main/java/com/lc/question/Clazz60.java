package com.lc.question;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmcc on 2019-11-19.
 */
public class Clazz60 {
    public String getPermutation(int n, int k) {
        if (n==0){
            return "1";
        }
        boolean [] used = new boolean[n];
        for (int i = 0; i < n; i++) {
            used[i]=false;
        }
        List<String> rsts = new ArrayList<String>();
        doGetPermutation(k,n,rsts,"",used);
        return rsts.get(rsts.size()-1);
    }

    private boolean doGetPermutation(int k, int n, List<String> rsts,String subRst ,boolean[] used){
        if (rsts.size()==k){
            return true;
        }
        if (subRst.length()==n){
            rsts.add(subRst);
            return false;
        }
        for (int i=1;i<=n;i++){
            if (!used[i-1]){
                subRst+=i;
                used[i-1]=true;
                //注意回溯！！！ 当遍历到终点时，删除已经遍历的点和其状态
                if(!doGetPermutation(k,n,rsts,subRst,used)){
                    used[i-1]=false;
                    subRst = subRst.substring(0,subRst.length()-1);
                }else{
                    return true;
                }
            }
        }
        return false;
    }
}
