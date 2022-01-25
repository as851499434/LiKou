package LfLiKou.EveryDay;

/**
 * @Author: liangfan
 * @Date: 2022-01-25 09:50
 * @Description: �����е���Դ���
 * <p>
 * ����һ������ n ����ʾ�����еĶ�������������ѭһ�ֶ��ص����ƣ�
 * �����ǰ�������� ż�� ����ôÿ֧���鶼������һ֧������ԡ��ܹ����� n / 2 ���������Ҳ��� n / 2 ֧���������һ�֡�
 * �����ǰ������Ϊ ���� ����ô��������ֿղ�����һ֧���飬����Ķ�����ԡ��ܹ����� (n - 1) / 2 ���������Ҳ��� (n - 1) / 2 + 1 ֧���������һ�֡�
 * �����ڱ����н��е���Դ�����ֱ��������ʤ����Ϊֹ��
 * <p>
 * ʾ�� 1��
 * ���룺n = 7
 * �����6
 * ���ͣ��������飺
 * - �� 1 �֣������� = 7 ����Դ��� = 3 ��4 ֧���������
 * - �� 2 �֣������� = 4 ����Դ��� = 2 ��2 ֧���������
 * - �� 3 �֣������� = 2 ����Դ��� = 1 ������ 1 ֧��ʤ���顣
 * ����Դ��� = 3 + 2 + 1 = 6
 * <p>
 * ʾ�� 2��
 * ���룺n = 14
 * �����13
 * ���ͣ��������飺
 * - �� 1 �֣������� = 14 ����Դ��� = 7 ��7 ֧���������
 * - �� 2 �֣������� = 7 ����Դ��� = 3 ��4 ֧���������
 * - �� 3 �֣������� = 4 ����Դ��� = 2 ��2 ֧���������
 * - �� 4 �֣������� = 2 ����Դ��� = 1 ������ 1 ֧��ʤ���顣
 * ����Դ��� = 7 + 3 + 2 + 1 = 13
 */

public class NumberOfMatches {
    public static void main(String[] args) {
        System.out.println(numberOfMatches(7));
    }
    public static int numberOfMatches(int n) {
        int sum = 0;
        while ( n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
                sum += n;
            } else {
                if (n == 1) break;
                n = n / 2 + 1;
                sum += (n - 1);
            }
        }
        return sum;
    }

    // ���� n ֧���飬ÿ��������̭һ֧������ʣ��һ֧�ھ��ӣ����� n - 1 ֧������Ҫͨ�� n - 1 ������������̭��
    public static int numberOfMatches2(int n) {
        return n - 1;
    }
}