package com.lc.question;

import com.lc.util.TreeNode;

/**
 * Created by cmcc on 2020-04-22.
 */
public class Clazz106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (postorder == null || postorder.length == 0 || inorder == null || inorder.length == 0 || postorder.length != inorder.length) {
            return null;
        }
        return doBuildTree(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }

    private TreeNode doBuildTree(int[] inorder, int inStart, int inEnd, int[] postorder, int poStart, int poEnd){
        //break condition
        //get root
        TreeNode treeNode = new TreeNode(postorder[poEnd]);
        //find root index in inorder
        int index =0;
        while (inorder[index]!=postorder[poEnd]){
            index++;
        }
        //error check
        if (index > inorder.length){
            return null;
        }
        treeNode.left = doBuildTree(inorder,inStart,inStart+index-1,postorder,poStart,poStart+index-1);
        treeNode.right = doBuildTree(inorder,inStart+index+1,inEnd,postorder,poStart+index,poEnd);
        return treeNode;

    }
}
