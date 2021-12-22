package LfLiKou.EveryDay;

import java.util.Arrays;

/**
 * @Author: liangfan
 * @Date: 2021-12-08 16:02
 * @Description: ����һ���������� nums ��һ������ k �������·����޸ĸ����飺
 *
 * ѡ��ĳ���±� i���� nums[i] �滻Ϊ -nums[i] ��
 * �ظ��������ǡ�� k �Ρ����Զ��ѡ��ͬһ���±� i ��
 * �����ַ�ʽ�޸�����󣬷������� ���ܵ����� ��
 *
 * ���룺nums = [4,2,3], k = 1
 * �����5
 * ���ͣ�ѡ���±� 1 ��nums ��Ϊ [4,-2,3]
 *
 * ̰���㷨
 */

public class LargestSumAfterKNegations {
    public static void main(String[] args) {
//        int[] nums = {4,2,3,0};
        int[] nums = {-2,9,9,8,4};

        System.out.println(largestSumAfterKNegations(nums,5));
    }
    public static int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            // ̰�ģ�����Ǹ�������k����ӯ�࣬�ͰѸ���������
            if (nums[i] < 0 && k > 0) {
                nums[i] = -1 * nums[i];
                k--;
            }
            sum += nums[i];
        }
        Arrays.sort(nums);
        // ���kûʣ����˵����ת�ĸ�����ת���ˣ��Ѿ������ͣ�����sum
        // ���k��ʣ��˵�������Ѿ�ȫ��ת�����������k��ʣż�������Լ�������������ɾ�������k��ʣ�������ͼ���2����С������
        return sum - (k % 2 == 0 ? 0 : 2 * nums[0]);
    }
}
