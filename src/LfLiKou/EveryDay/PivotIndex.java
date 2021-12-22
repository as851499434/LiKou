package LfLiKou.EveryDay;

import java.util.Arrays;

/**
 * @Author: liangfan
 * @Date: 2021-12-14 14:10
 * @Description: ����һ����������nums ������������ �����±� ��
 * ���� �����±� �������һ���±꣬���������Ԫ����ӵĺ͵����Ҳ�����Ԫ����ӵĺ͡�
 * ��������±�λ����������ˣ���ô�����֮����Ϊ 0 ����Ϊ���±����಻����Ԫ�ء���һ����������±�λ���������Ҷ�ͬ�����á�
 * ��������ж�������±꣬Ӧ�÷��� ������ ����һ����������鲻���������±꣬���� -1 ��
 */

public class PivotIndex {
    public static void main(String[] args) {

    }

    public static int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (sum + sum  == total - nums[i]) {
                return i;
            }
            sum += nums[i];
        }
        return -1;

//        int sum = Arrays.stream(nums).sum();
//        for (int i = 0; i < nums.length; i++) {
//            int left = left(nums, i);
//            int right = right(nums, i);
//            if (left == right) {
//                return i;
//            }
//        }
//        return -1;
    }

    public static int left(int[] nums, int index) {
        int sum = 0;
        for (int i = index; i >= 0; i--) {
            sum += nums[i];
        }
        return sum;
    }

    public static int right(int[] nums, int index) {
        int sum = 0;
        for (int i = index; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
