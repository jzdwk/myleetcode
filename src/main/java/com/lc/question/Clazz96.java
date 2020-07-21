package com.lc.question;

import com.lc.util.TreeNode;

import java.util.LinkedList;

/**
 * Created by cmcc on 2020-01-13.
 */
public class Clazz96 {
    public int numTrees(int n) {
        if (n ==0 || n==1) return n;
        int[] cache = new int[n+1];
        return doNumTrees(1,n,cache);
    }

    private int doNumTrees(int start, int end,int[] cache) {
        int rst = 0;
        //id start > end, means only one num in subtree
        if (start > end) {
           return 1;
        }
        // pick up a root
        for (int i = start; i <= end; i++) {
            if (cache[i]!=0) return cache[i];
            // all possible left subtrees if i is choosen to be a root
            int leftNums = doNumTrees(start, i - 1,cache);
            // all possible right subtrees if i is choosen to be a root
            int rightNums = doNumTrees(i + 1, end, cache);
            rst +=leftNums*rightNums;
            cache[i] = rst;
        }
        return rst;
    }

    /*
    * F(i):以i为根的二叉树个数  G(n) = F(1)+..+F(n) 其中G(n)为长度为n的子树的个数
    * 且 F(i) = G(i-1)*G(n-i)
    * 所以，G(n) = G(0)*G(0)+G(1)*G(n-2)+...+G(n-1)*G(0)
    * G[0]=0 G[1]=1 G[2]=2
    * 求G[n]
    * */
    public int numTrees2(int n) {
        if (n ==0 || n==1) return n;
        int[] G = new int[n+1];
        G[0] = 1;
        G[1] = 1;
        //G(n)
        for (int i = 2; i <= n; ++i) {
            //F(i)
            for (int j = 1; j <= i; ++j) {
                G[i] += G[j - 1] * G[i - j];
            }
        }
        return G[n];
    }
}
