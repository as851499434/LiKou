package LfLiKou.EveryDay;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: liangfan
 * @Date: 2021-12-23 13:17
 * @Description:矩阵置零
 * 给定一个 m x n 的矩阵，如果一个元素为 0 ，则将其所在行和列的所有元素都设为 0 。请使用 原地 算法。
 * 输入：matrix =
 * [[1,1,1],
 * [1,0,1],
 * [1,1,1]]
 * 输出：
 * [[1,0,1],
 * [0,0,0],
 * [1,0,1]]
 *
 * 输入：matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
 * 输出：[[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 */

public class SetZeroes {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] matrix2 = {{0,1,2,0}, {3,4,5,2}, {1,3,1,5}};
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix2[i]));
        }
        System.out.println();
        setZeroes(matrix2);
    }

    //感觉挺垃圾的
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        Map <Integer, Integer> xmap = new HashMap<>(), ymap = new HashMap<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int value = matrix[i][j];
                if (value == 0) {
                    xmap.put(i,i);
                    ymap.put(j,j);
                }
            }
        }
        for (Integer x : xmap.keySet()) {
            for (int i = 0; i < n; i++) {
                matrix[x][i] = 0;
            }
        }

        for (Integer y : ymap.keySet()) {
            for (int i = 0; i < m; i++) {
                matrix[i][y] = 0;
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

}
