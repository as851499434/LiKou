package LfLiKou.EveryDay;

import java.util.Arrays;

/**
 * @Author: liangfan
 * @Date: 2021-12-22 14:40
 * @Description: �� MATLAB �У���һ���ǳ����õĺ��� reshape �������Խ�һ��m x n ��������Ϊ��һ����С��ͬ��r x c�����¾��󣬵�������ԭʼ���ݡ�
 * ����һ���ɶ�ά���� mat ��ʾ��m x n �����Լ����������� r �� c ���ֱ��ʾ��Ҫ���ع��ľ����������������
 * �ع���ľ�����Ҫ��ԭʼ���������Ԫ������ͬ�� �б���˳�� ��䡣
 * ������и��������� reshape �����ǿ����Һ���ģ�������µ����ܾ��󣻷������ԭʼ����
 * <p>
 * ���룺mat = [[1,2],[3,4]], r = 1, c = 4
 * �����[[1,2,3,4]]
 * <p>
 * ���룺mat = [[1,2],[3,4]], r = 2, c = 4
 * �����[[1,2],[3,4]]
 */

public class MatrixReshape {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}};
        int[][] ints = matrixReshape(arr, 1, 1);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(Arrays.toString(ints[i]));
        }
    }

    //�Ż�
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

    //�����ⷨ
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
