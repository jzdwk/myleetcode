package com.lc.question;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cmcc on 2019-11-19.
 */
public class Clazz62 {
    public int uniquePaths(int m, int n) {
        if (m == 0 || n == 0) return 0;
        if (m == 1||n==1) return 1;
        return uniquePaths(m-1,n)+uniquePaths(m,n-1);
    }

    public int uniquePaths2(int m, int n) {
        int[][] cache = new int[101][101];
        return doPath(cache,m,n);
    }
    private int doPath(int[][] cache, int m, int n){
        if (m == 0 || n == 0) return 0;
        if (m == 1||n==1) return 1;
        if (cache[m][n]>0) return cache[m][n];
        int rst = doPath(cache,m-1,n)+doPath(cache,m,n-1);
        cache[m][n] = rst;
        return rst;
    }


    public int uniquePaths3(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < n; i++) dp[0][i] = 1;
        for (int i = 0; i < m; i++) dp[i][0] = 1;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}
