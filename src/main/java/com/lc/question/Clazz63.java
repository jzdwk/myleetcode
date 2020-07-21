package com.lc.question;

/**
 * Created by cmcc on 2019-11-20.
 */
public class Clazz63 {
    public int uniquePathsWithObstacles1(int[][] obstacleGrid) {
        if (obstacleGrid == null) return 0;
        int rows = obstacleGrid.length;
        int cols = obstacleGrid[0].length;
        int[][] cache = new int[rows+1][cols+1];
        return doUniquePathsWithObstacles1(cache,obstacleGrid,rows,cols);
    }
    private int doUniquePathsWithObstacles1(int[][] cache,int[][] obstacleGrid, int m, int n){
        if (obstacleGrid[m-1][n-1] == 1) return 0;
        if (m == 0 || n == 0) return 0;

        //deal with like [0,0,1,0]
        if (m == 1){
            if (!hasObstacles("col",n,obstacleGrid)) return 1;
            else return 0;
        }
        if (n == 1){
            if (!hasObstacles("row",m,obstacleGrid)) return 1;
            else return 0;
        }
        if (cache[m][n]>0) return cache[m][n];
        int rst = doUniquePathsWithObstacles1(cache,obstacleGrid,m-1,n)+doUniquePathsWithObstacles1(cache,obstacleGrid,m,n-1);
        cache[m][n] = rst;
        return rst;
    }
    private boolean hasObstacles(String type,int nums,int[][] obstacleGrid){
        if (type.equals("col")){
            for (int i = 0; i < nums; i++) {
                if (obstacleGrid[0][i]==1) return true;
            }
        }else{
            for (int i = 0; i < nums; i++) {
                if (obstacleGrid[i][0]==1) return true;
            }
        }
        return false;
    }
}
