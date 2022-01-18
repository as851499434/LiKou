package LfLiKou.EveryDay;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Author: liangfan
 * @Date: 2022-01-18 09:12
 * @Description: ��Сʱ���
 * ����һ�� 24 Сʱ�ƣ�Сʱ:���� "HH:MM"����ʱ���б��ҳ��б�����������ʱ�����Сʱ���Է�������ʾ��
 * ʾ�� 1��
 *
 * ���룺timePoints = ["23:59","00:00"]
 * �����1
 * ʾ�� 2��
 *
 * ���룺timePoints = ["00:00","23:59","00:00"]
 * �����0
 */

public class FindMinDifference {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("00:00");
        strings.add("23:59");
        strings.add("00:00");
        Collections.sort(strings);
        System.out.println(strings);
        System.out.println(findMinDifference(strings));
    }

    public static int findMinDifference(List<String> timePoints) {
        Collections.sort(timePoints);
        int ans = Integer.MAX_VALUE;
        int t0Minutes = getMinutes(timePoints.get(0));
        int preMinutes = t0Minutes;
        for (int i = 1; i < timePoints.size(); ++i) {
            int minutes = getMinutes(timePoints.get(i));
            ans = Math.min(ans, minutes - preMinutes); // ����ʱ���ʱ���
            preMinutes = minutes;
        }
        ans = Math.min(ans, t0Minutes + 1440 - preMinutes); // ��βʱ���ʱ���
        return ans;
    }

    public static int getMinutes(String t) {
        return ((t.charAt(0) - '0') * 10 + (t.charAt(1) - '0')) * 60 + (t.charAt(3) - '0') * 10 + (t.charAt(4) - '0');
    }

}
