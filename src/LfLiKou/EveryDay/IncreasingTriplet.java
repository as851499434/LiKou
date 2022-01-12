package LfLiKou.EveryDay;

import java.util.Arrays;

/**
 * @Author: liangfan
 * @Date: 2022-01-12 09:06
 * @Description: ��������Ԫ������
 *
 * ����һ����������nums ���ж�����������Ƿ���ڳ���Ϊ 3 �ĵ��������С�
 *
 * ���������������Ԫ���±� (i, j, k)������ i < j < k ��ʹ��nums[i] < nums[j] < nums[k] ������ true �����򣬷��� false ��
 */

public class IncreasingTriplet {
    public static void main(String[] args) {
        int[] ints = {20,5,10,12,100,13};

        System.out.println(increasingTriplet(ints));
    }
    public static boolean increasingTriplet(int[] nums) {
        /**
         a ��¼��С��Ԫ�أ�b��¼�ڶ�С��Ԫ�أ�������ֵ���С��Ԫ�أ�˵������������
         */
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        for (int e : nums) {
            if (e <= a) {
                a = e;
            } else if (e <= b) {
                b = e;
            } else {
                return true;
            }
        }
        return false;
    }
}
