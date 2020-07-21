package com.lc.util;

/**
 * Created by cmcc on 2020-01-02.
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; }

    public static boolean equals(TreeNode t1, TreeNode t2){
        if (t1 == null&& t2 == null) return true;
        if (t1 == null || t2 == null)return false;
        return (t1.val == t2.val)&&equals(t1.left,t2.left)&&equals(t1.right,t2.right);
    }
}
