package LiKou.EveryDay;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Author: liangfan
 * @Date: 2021-12-07 16:29
 * @Description:����һ������Ϊ n ���������� score ������ score[i] �ǵ� i λ�˶�Ա�ڱ����еĵ÷֡����е÷ֶ� ������ͬ ��
 *
 * �˶�Ա�����ݵ÷� �������� ���������ε� 1 ���˶�Ա�÷���ߣ����ε� 2 ���˶�Ա�÷ֵ� 2 �ߣ��������ơ��˶�Ա�����ξ��������ǵĻ������
 *
 * ���ε� 1 ���˶�Ա����� "Gold Medal" ��
 * ���ε� 2 ���˶�Ա������ "Silver Medal" ��
 * ���ε� 3 ���˶�Ա��ͭ�� "Bronze Medal" ��
 * �����ε� 4 ���� n ���˶�Ա��ֻ�ܻ�����ǵ����α�ţ��������ε� x ���˶�Ա��ñ�� "x"����
 * ʹ�ó���Ϊ n ������ answer ���ػ񽱣����� answer[i] �ǵ� i λ�˶�Ա�Ļ������
 *
 * ���룺score = [10,3,8,9,4]
 * �����["Gold Medal","5","Bronze Medal","Silver Medal","4"]
 * ���ͣ�����Ϊ [1st, 5th, 3rd, 2nd, 4th] ��

 */

public class FindRelativeRanks {
    public static void main(String[] args) {
//        int[] s = {5,4,3,2,1};//[1, 3, 5, 7, 8]
        int[] s = {10,3,8,9,4};//[3, 4, 8, 9, 10]

        String[] relativeRanks = findRelativeRanks2(s);
        System.out.println(Arrays.toString(relativeRanks));
    }
    public static String[] findRelativeRanks(int[] score) {
        int flag = 3;
        String[] s = new String[score.length];
        int[] s2 = Arrays.copyOf(score, score.length);
        for (int i = s2.length - 1 ; i >= 0; i--) {
            for (int j = 0; j < score.length; j++) {
                if (s2[i] == score[j]) {
                    if (i == score.length -1) {
                        s[j] = "Gold Medal";
                    } else if (i == score.length -2) {
                        s[j] = "Silver Medal";
                    } else if (i == score.length -3) {
                        s[j] = "Bronze Medal";
                    } else {
                        s[j] = String.valueOf(++flag);
                    }
                }
            }
        }
        return s;
    }


    public static String[] findRelativeRanks2(int[] score) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < score.length; i++) map.put(score[i],i);
        Arrays.sort(score);
        String[] s = new String[score.length];
        for (int i = score.length - 1; i >= 0; i--) {
            int value = map.get(score[i]);
            if (i == score.length - 1) s[map.get(score[i])] = "Gold Medal";
            else if (i == score.length - 2) s[map.get(score[i])] = "Silver Medal";
            else if (i == score.length - 3) s[map.get(score[i])] = "Bronze Medal";
            else s[map.get(score[i])] = String.valueOf(score.length - i);
        }

        return s;
    }
}
