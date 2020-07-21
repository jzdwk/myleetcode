package com.lc.question;

import com.lc.util.TreeNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by cmcc on 2020-03-03.
 */
@RunWith(Parameterized.class)
public class Clazz98Test {
    private boolean expect;
    private TreeNode tree;

    public Clazz98Test(boolean expect, TreeNode tree) {
        this.expect = expect;
        this.tree = tree;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        TreeNode node10 = new TreeNode(10);
        TreeNode node5 = new TreeNode(5);
        TreeNode node15 = new TreeNode(15);
        TreeNode node6 = new TreeNode(6);
        TreeNode node20 = new TreeNode(20);
        node10.left = node5;
        node10.right = node15;
        node15.left = node6;
        node15.right = node20;

        return Arrays.asList(new Object[][]{
                //set test case  {expect,param}
                {false,node10}
        });
    }

    @Test
    public void isValidBST() throws Exception {
        boolean rst = new Clazz98().isValidBST2(tree);
        assertEquals(rst,expect);
    }

}