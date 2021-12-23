package LfLiKou.EveryDay;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: liangfan
 * @Date: 2021-12-23 13:17
 * @Description:��������
 * ����һ�� m x n �ľ������һ��Ԫ��Ϊ 0 �����������к��е�����Ԫ�ض���Ϊ 0 ����ʹ�� ԭ�� �㷨��
 * ���룺matrix =
 * [[1,1,1],
 * [1,0,1],
 * [1,1,1]]
 * �����
 * [[1,0,1],
 * [0,0,0],
 * [1,0,1]]
 *
 * ���룺matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
 * �����[[0,0,0,0],[0,4,5,0],[0,3,1,0]]
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

    //�о�ͦ������
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
