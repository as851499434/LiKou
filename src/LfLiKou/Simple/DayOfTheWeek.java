package LfLiKou.Simple;

/**
 * @Author: liangfan
 * @Date: 2022-01-04 14:30
 * @Description: һ���еĵڼ���
 * ����һ�����ڣ��������һ���㷨���ж����Ƕ�Ӧһ���е���һ�졣
 * ����Ϊ����������day��month ��year���ֱ��ʾ�ա��¡��ꡣ
 * �����صĽ���������⼸��ֵ�е�һ��{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}��
 */

public class DayOfTheWeek {
    public static void main(String[] args) {
        DayOfTheWeek info = new DayOfTheWeek();
        System.out.println(info.dayOfTheWeek(4,1,2022));

    }


    public String dayOfTheWeek(int day, int month, int year) {
        String[] ss = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] nums = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int ans = 4;
        for (int i = 1971; i < year; i++) {
            boolean isLeap = (i % 4 == 0 && i % 100 != 0) || i % 400 == 0;
            ans += isLeap ? 366 : 365;
        }
        for (int i = 1; i < month; i++) {
            ans += nums[i - 1];
            if (i == 2 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) ans++;
        }
        ans += day;
        return ss[ans % 7];
    }

    public String dayOfTheWeek2(int day, int month, int year) {
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        /* �������֮ǰ����ݵ��������� */
        int days = 365 * (year - 1971) + (year - 1969) / 4;
        /* ��������У������·�֮ǰ���·ݵ��������� */
        for (int i = 0; i < month - 1; ++i) {
            days += monthDays[i];
        }
        if ((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) && month >= 3) {
            days += 1;
        }
        /* �����·��е��������� */
        days += day;
        return week[(days + 3) % 7];
    }

}
