package LfLiKou.DynamicProgram;

/**
 * @Author: liangfan
 * @Date: 2021-12-21 14:49
 * @Description: ������������¥�ݡ���Ҫ n ������ܵ���¥����
 * ÿ��������� 1 �� 2 ��̨�ס����ж����ֲ�ͬ�ķ�����������¥���أ�
 * ע�⣺���� n ��һ����������
 */

public class ClimbStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(44));
    }

    //��̬�滮
    public static int climbStairs(int n) {
        // b����ֵ
        int a = 0, b = 0, sum = 1;
        for (int i = 0; i < n; i++) {
            a = b;
            b = sum;
            sum = a + b;
        }
        return sum;
    }

    //����ݹ�
    public static int climbStairs2(int n) {
        int[] arr = new int[n + 1];
        if (n == 0 || n == 1 || n == 2) {
            return n;
        } else if (arr[n] != 0) {
            return arr[n];
        } else {
            return arr[n] = climbStairs2(n - 1) + climbStairs2(n - 2);
        }

    }
}
