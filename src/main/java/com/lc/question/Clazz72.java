package com.lc.question;

/**
 * Created by cmcc on 2019-11-29.
 */
public class Clazz72 {
    public void setZeroes(int[][] matrix) {
        if (matrix == null) return;
        int rows = matrix.length;
        int cols = matrix[0].length;
        //O(m+n)  思考，用原始数组的第一行 第一列直接作为存储呢？
        boolean[] zeroCols = new boolean[cols];
        boolean[] zeroRows = new boolean[rows];
        //O(mn)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j]==0){
                    zeroCols[j] = true;
                    zeroRows[i] = true;
                }
            }
        }
        //set zero
        for (int i = 0; i < cols; i++) {
            if (zeroCols[i]){
                for (int j = 0; j < rows; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            if (zeroRows[i]){
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

    }
}
