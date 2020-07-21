package com.lc.question;

/**
 * Created by cmcc on 2019-11-28.
 */
public class Clazz71 {
    // i horse  j rose
    // Distance[i][j]表示第一个单词word1的前i个字母与第2个单词word2的前j个字母的最短距离，有
    // 则有：
    //  1. 如果最后一个字母相同,即word1[i] == word2[j]
    //  Distance[i][j] = Distance[i-1][j-1]
    //  2. 否则
    //  Distance[i][j] = 1 + Min(Distance[i−1][j],Distance[i][j−1],Distance[i−1][j−1])
    //  其中 Distance[i−1][j] 表示删除word1的i Distance[i][j-1]表示插入word1  Distance[i-1][j-1]表示替换
    public int minDistance(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        int[][] dp = new int[n1 + 1][n2 + 1];
        // 第一行
        for (int j = 1; j <= n2; j++) dp[0][j] = dp[0][j - 1] + 1;
        // 第一列
        for (int i = 1; i <= n1; i++) dp[i][0] = dp[i - 1][0] + 1;

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) dp[i][j] = dp[i - 1][j - 1];
                else dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i][j - 1]), dp[i - 1][j]) + 1;
            }
        }
        return dp[n1][n2];
    }
}
