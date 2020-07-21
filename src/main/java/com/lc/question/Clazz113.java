package com.lc.question;

import com.lc.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmcc on 2020-05-21.
 */
public class Clazz113 {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> rst = new ArrayList();
        List<Integer> sub = new ArrayList();
        doPathSum(root,sum,rst,sub);
        return rst;
    }

    public void doPathSum(TreeNode root, int sum, List<List<Integer>> rst, List<Integer> sub) {
        if (root == null){
            return;
        }
        sub.add(root.val);
        sum -= root.val;
        if (sum < 0){
            sub.remove(sub.size()-1);
            return;
        }
        if (sum == 0){
            ArrayList<Integer> ans = new ArrayList<Integer>();
            ans.addAll(sub);
            rst.add(ans);
            sub.remove(sub.size()-1);
            return;
        }
        doPathSum(root.left,sum,rst,sub);
        doPathSum(root.right,sum,rst,sub);
        sub.remove(sub.size()-1);
    }
}
