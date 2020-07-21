package com.lc.question;

import com.lc.util.TreeNode;

import java.util.Stack;

/**
 * Created by cmcc on 2020-01-23.
 */
public class Clazz98 {

    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
        double inorder = - Double.MAX_VALUE;

        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            // If next element in inorder traversal
            // is smaller than the previous one
            // that's not BST.
            if (root.val <= inorder) return false;
            inorder = root.val;
            root = root.right;
        }
        return true;
    }

    Stack<TreeNode> stack = new Stack();
    public boolean isValidBST2(TreeNode root) {
        if (root == null) return true;
        if (!isValidBST2(root.left)) return false;
        if (stack.isEmpty()){
            stack.push(root);
        }else{
            int top = stack.peek().val;
            if (top>root.val){
                return false;
            }else {
                stack.push(root);
            }
        }
        if (!isValidBST2(root.right)) return false;
        return true;
    }
}
