package com.lc.question;

import com.lc.util.TreeNode;

/**
 * Created by cmcc on 2020-04-21.
 */
public class Clazz105 {
    public TreeNode buildTree(int[] preorder, int[] inorder){
        if (preorder == null || preorder.length == 0 || inorder == null || inorder.length == 0 || preorder.length != inorder.length) {
            return null;
        }
        return doBuildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }
    private TreeNode doBuildTree(int[] preorder, int pStart, int pEnd, int[] inorder, int iStart, int iEnd) {
        //递归的第一步：递归终止条件，避免死循环
        if (pStart > pEnd || iStart > iEnd) {
            return null;
        }
        //重建根节点
        TreeNode treeNode = new TreeNode(preorder[pStart]);
        int index = 0;  //index找到根节点在中序遍历的位置
        while (inorder[iStart + index] != preorder[pStart]) {
            index++;
        }
        //重建左子树
        treeNode.left = doBuildTree(preorder, pStart + 1, pStart + index, inorder, iStart, iStart + index - 1);
        //重建右子树
        treeNode.right = doBuildTree(preorder, pStart + index + 1, pEnd, inorder, iStart + index + 1, iEnd);
        return treeNode;

    }
}
