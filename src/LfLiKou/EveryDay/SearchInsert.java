package LfLiKou.EveryDay;

/**
 * @Author: liangfan
 * @Date: 2021-12-14 15:37
 * @Description: ����һ�����������һ��Ŀ��ֵ�����������ҵ�Ŀ��ֵ�������������������Ŀ��ֵ�������������У����������ᱻ��˳������λ�á�
 * �����ʹ��ʱ�临�Ӷ�Ϊ O(log n) ���㷨��
 */

public class SearchInsert {
    public static void main(String[] args) {
        int[] nums = {1,  3, 4, 5};

        System.out.println(searchInsert(nums,2));
        System.out.println(9%3);
    }
    public static int searchInsert(int[] nums, int target) {
        // ���ַ�
        int left = 0, right = nums.length - 1 ;
        while (left <= right) {
            // mid = (left + right) ��ֹ left+right �������
            int mid = left + (right - left)/2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        return left;
    }
}
