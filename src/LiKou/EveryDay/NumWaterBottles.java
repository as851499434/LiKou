package LiKou.EveryDay;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @Author: liangfan
 * @Date: 2021-12-17 10:37
 * @Description:
 * С�����������ڴ������� numExchange ���վ�ƿ���Զһ�һƿ�¾ơ��㹺���� numBottles ƿ�ơ�
 * ����ȵ��˾�ƿ�еľƣ���ô��ƿ�ͻ��ɿյġ�
 * ������� ��� �ܺȵ�����ƿ��
 *
 * ���룺numBottles = 9, numExchange = 3
 * �����13
 * ���ͣ�������� 3 ���վ�ƿ�һ� 1 ƿ�ơ�
 * ��������ܺȵ� 9 + 3 + 1 = 13 ƿ�ơ�
 *
 */

public class NumWaterBottles {
    public static void main(String[] args) {
        NumWaterBottles numWaterBottles = new NumWaterBottles();
        System.out.println(numWaterBottles.numWaterBottles(17,18));
    }
    public int numWaterBottles(int numBottles, int numExchange) {
        //�Ѻ�ƿ��
        int sum = numBottles + numBottles / numExchange;
        //����ƿ�� �� ʣ�Ŀ�ƿ��
        int rsum = numBottles / numExchange + numBottles % numExchange;
        while ( rsum/numExchange != 0) {
            sum += rsum/numExchange;
            //��ȥ����ƿ�� �����ºȵ�ƿ��
            rsum = rsum - rsum/numExchange * numExchange + rsum/numExchange;
        }
        return sum;
    }

    //Сѧ��ѧ����
    public int numWaterBottles2(int n, int m) {
        int cnt = n / (m  - 1);
        return n % (m - 1) == 0 ? n + cnt - 1 : n + cnt;
    }



}
