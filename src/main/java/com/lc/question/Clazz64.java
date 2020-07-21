package com.lc.question;

/**
 * Created by cmcc on 2019-11-21.
 */
public class Clazz64 {
    //f(m,n)=Min(f(m,n+1),f(m+1,n))
    public int minPathSum(int[][] grid) {
        if (grid == null) return 0;
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] cache = new int[rows+1][cols+1];
        return doMinPathSum(0,grid,cache,rows,cols,0,0);
    }
    public int doMinPathSum(int rst,int[][] grid, int[][] cache, int rows, int cols, int curRows, int curCols) {
        int rst1 = rst;
        //beyond
        if (curCols>cols-1||curRows>rows-1) return rst1;
        //equals col, sum rows
        if (curCols == cols-1){
            for (int i = curRows;i<rows;i++){
                rst1 += grid[i][curCols];
            }
            cache[curRows][curCols] = rst1;
            return rst1;
        }
        //equals row, sum cols
        if (curRows == rows -1 ){
            for (int i = curCols; i < cols; i++) {
                rst1+=grid[curRows][i];
            }
            cache[curRows][curCols] = rst1;
            return rst1;
        }
        //do min
        if (cache[curRows][curCols] > 0) {
            rst1 = grid[curRows][curCols]+cache[curRows][curCols];
        }else{
            int down = doMinPathSum(rst1,grid,cache,rows,cols,curRows+1,curCols);
            int right = doMinPathSum(rst1,grid,cache,rows,cols,curRows,curCols+1);
            cache[curRows][curCols] = Math.min(down,right);
            rst1 = cache[curRows][curCols]+grid[curRows][curCols];
        }
        return rst1;
    }
}
