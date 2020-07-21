package com.lc.question;

import com.lc.util.TreeNode;

import java.util.*;

/**
 * Created by cmcc on 2020-03-12.
 */
public class Clazz102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        TreeMap<Integer,List<Integer>> set = new TreeMap<Integer, List<Integer>>();
        doLevelOrder(set,root,0);
        List<List<Integer>> rst = new ArrayList<List<Integer>>();
        Iterator titer=set.entrySet().iterator();
        while(titer.hasNext()){
            Map.Entry ent=(Map.Entry )titer.next();
            List val= (List) ent.getValue();
            rst.add(val);
        }
        return rst;
    }


    private void doLevelOrder(TreeMap<Integer,List<Integer>> set,TreeNode root,int level){
        if (root == null) return;
        if (set.get(level)==null){
            List<Integer> list = new ArrayList<Integer>();
            list.add(root.val);
            set.put(level,list);
        }else{
            set.get(level).add(root.val);
        }

        doLevelOrder(set,root.left,level+1);
        doLevelOrder(set,root.right,level+1);
    }
}
