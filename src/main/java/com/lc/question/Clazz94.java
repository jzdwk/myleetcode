package com.lc.question;

import com.lc.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmcc on 2020-01-02.
 */
public class Clazz94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> rst = new ArrayList<Integer>();
        if (root == null) return rst;
        inOrderTraversal(rst,root);
        return rst;
    }
    private void inOrderTraversal(List<Integer> rst, TreeNode root){
        if (root.left != null) inOrderTraversal(rst,root.left);
        rst.add(root.val);
        if (root.right!=null) inOrderTraversal(rst,root.right);
    }
}
