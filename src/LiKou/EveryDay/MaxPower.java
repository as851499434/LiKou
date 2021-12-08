package LiKou.EveryDay;

/**
 * @Author: liangfan
 * @Date: 2021-12-07 16:05
 * @Description: ����һ���ַ��� s ���ַ����ġ�����������Ϊ��ֻ����һ���ַ�����ǿ����ַ����ĳ��ȡ� ���㷵���ַ�����������
 * ���룺s = "leetcode"
 * �����2
 * ���ͣ����ַ��� "ee" ����Ϊ 2 ��ֻ�����ַ� 'e' ��
 */

public class MaxPower {
    public static void main(String[] args) {
        int sum = maxPower("j");
        System.out.println(sum);
    }
    public static int maxPower(String s) {
        int sum = 1, max = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                sum ++;
                max = Math.max(sum, max);
            } else {
                sum = 1;
            }
        }
        return max;
    }



}
