package LiKou.DynamicProgram;

/**
 * @Author: liangfan
 * @Date: 2021-11-19 09:53
 * @Description: ��Ʊ���������
 * �����ĳ��Ʊ�ļ۸���ʱ���Ⱥ�˳��洢�������У����������ù�Ʊһ�ο��ܻ�õ���������Ƕ��٣�
 * ����: [7,1,5,3,6,4]
 * ���: 5
 * ����: �ڵ� 2 �죨��Ʊ�۸� = 1����ʱ�����룬�ڵ� 5 �죨��Ʊ�۸� = 6����ʱ��������������� = 6-1 = 5 ��
 *      ע���������� 7-1 = 6, ��Ϊ�����۸���Ҫ��������۸�
 * ����: [7,6,4,3,1]
 * ���: 0
 * ����: �����������, û�н������, �����������Ϊ 0��
 */
public class MaxProfit {
    public static void main(String[] args) {
//        int[] ints = {7,1,5,3,6,4};
        int[] ints = {7,6,4,3,1};
        int i = maxProfit(ints);
        System.out.println(i);
    }
    public static int maxProfit(int[] prices) {
        int cost = Integer.MAX_VALUE, profit = 0;
        for (int price : prices) {
            cost = Math.min(cost, price);
            profit = Math.max(profit, price - cost);
        }
        return profit;
    }
}
