package LfLiKou.EveryDay;

/**
 * @Author: liangfan
 * @Date: 2022-01-17 15:31
 * @Description: �����������е�Ǯ
 * Hercy ��ҪΪ�����һ������Ǯ���� ÿ�� ���������������Ǯ��
 * �ʼ��������һ��ʱ����� 1��Ǯ�����ܶ������գ���ÿ�춼��ǰһ������ 1��Ǯ���ڽ�����ÿһ����һ��������� ǰһ����һ ����� 1��Ǯ��
 * ����n�����㷵���ڵ� n�������ʱ���������������ܹ����˶��ٿ�Ǯ��
 * ʾ�� 2��
 * <p>
 * ���룺n = 10
 * �����37
 * ���ͣ��� 10 ����ܶ�Ϊ (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4) = 37 ��ע�⵽�ڶ�������һ��Hercy ���� 2 ��Ǯ��
 */

public class TotalMoney {
    public static void main(String[] args) {
        TotalMoney totalMoney = new TotalMoney();

        System.out.println(totalMoney.totalMoney(26));
    }

    public int totalMoney(int n) {
//        int sum = 28;
//        if (n / 7 > 0) {
//            for (int i = 1; i < n / 7; i++) {
//                sum = sum*2 + 7;
//            }
//            return sum;
//        } else {
//            return (1+n)*n/2;
//        }
        int i = n / 7;
        int j = n % 7;
        return i > 0 ? (28 * i + (1+(i - 1))*(i - 1)/2 * 7) + ((1+j)*j/2 + (i * j)) : (1+n)*n/2;
//        1+2
//        2+3
//        3+4
//        4+5+6+7+8
    }
}
