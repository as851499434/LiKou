package LfLiKou.EveryDay;

import java.util.Arrays;

/**
 * @Author: liangfan
 * @Date: 2021-12-22 14:40
 * @Description: 在 MATLAB 中，有一个非常有用的函数 reshape ，它可以将一个m x n 矩阵重塑为另一个大小不同（r x c）的新矩阵，但保留其原始数据。
 * 给你一个由二维数组 mat 表示的m x n 矩阵，以及两个正整数 r 和 c ，分别表示想要的重构的矩阵的行数和列数。
 * 重构后的矩阵需要将原始矩阵的所有元素以相同的 行遍历顺序 填充。
 * 如果具有给定参数的 reshape 操作是可行且合理的，则输出新的重塑矩阵；否则，输出原始矩阵。
 * <p>
 * 输入：mat = [[1,2],[3,4]], r = 1, c = 4
 * 输出：[[1,2,3,4]]
 * <p>
 * 输入：mat = [[1,2],[3,4]], r = 2, c = 4
 * 输出：[[1,2],[3,4]]
 */

public class MatrixReshape {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}};
        int[][] ints = matrixReshape(arr, 1, 1);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(Arrays.toString(ints[i]));
        }
    }

    //优化
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        if (r * c != m * n) {
            return mat;
        }
        int[][] ints = new int[r][c];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i > r - 1 || j > n - 1) {

                } else {
                    ints[i][j] = mat[i][j];
                }

            }
        }
        return ints;
    }

    //暴力解法
    public static int[][] matrixReshape2(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length, index = 0, rindex = 0;
        if (r <= 0 || c <= 0 || r * c != m * n) {
            return mat;
        }
        int[] arr = new int[m * n];
        int[][] ints = new int[r][c];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[index++] = mat[i][j];
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ints[i][j] = arr[rindex++];
            }
        }
        return ints;
    }
}
