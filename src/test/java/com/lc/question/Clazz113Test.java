package com.lc.question;

import com.lc.util.TreeNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by cmcc on 2020-05-21.
 */

@RunWith(Parameterized.class)
public class Clazz113Test {
    private List<List<Integer>> expect;
    private TreeNode tree;
    private int sum;


    public Clazz113Test(List<List<Integer>> expect, TreeNode tree, int sum) {
        this.expect = expect;
        this.tree = tree;
        this.sum = sum;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {

        TreeNode node5 = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);
        TreeNode node8 = new TreeNode(8);
        TreeNode node11 = new TreeNode(11);
        TreeNode node13 = new TreeNode(13);
        TreeNode node7 = new TreeNode(7);

        node5.left = node4;
        node5.right = node8;
        node4.left = node11;
        node8.left = node13;
        node8.right = node7;
        ArrayList<Integer> rst1 = new ArrayList<Integer>();
        rst1.add(5);
        rst1.add(4);
        rst1.add(11);
        ArrayList<Integer> rst2 = new ArrayList<Integer>();
        rst1.add(5);
        rst1.add(8);
        rst1.add(7);
        ArrayList<ArrayList<Integer>> expect = new ArrayList<ArrayList<Integer>>();
        expect.add(rst1);
        expect.add(rst2);

        return Arrays.asList(new Object[][]{
                //set test case  {expect,param}
                {expect,node5,20}
        });
    }

    @Test
    public void name() throws Exception {
        List<List<Integer>> rst =  new Clazz113().pathSum(tree,sum);
        assertEquals(rst,expect);
    }
}
