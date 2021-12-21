package LiKou.Division;

/**
 * @Author: liangfan
 * @Date: 2021-12-17 15:49
 * @Description: 287
 * ����һ������n + 1 ������������nums �������ֶ��� 1 �� n֮�䣨���� 1 �� n������֪���ٴ���һ���ظ���������
 * ���� nums ֻ�� һ���ظ������� ���ҳ� ����ظ����� ��
 * ����ƵĽ���������벻�޸����� nums ��ֻ�ó����� O(1) �Ķ���ռ䡣
 */

public class FindDuplicate {
    public static void main(String[] args) {
        FindDuplicate findDuplicate = new FindDuplicate();
        int[] arr = {3,1,3,4,2};
        int[] arr2 = {1,3,4,2,2};
        System.out.println(findDuplicate.findDuplicate2(arr2));
        System.out.println(findDuplicate.findDuplicate(arr2));
    }


    public int findDuplicate(int[] nums) {
        int  left = 1, right = nums.length - 1;
        while (left < right) {
            int count = 0;
            int mid = left + (right - left)/2;
            for (int num : nums) {
                if (num <= mid) {
                    count++;
                }
            }

            if (count > mid) {
                right = mid;
            } else {
                left = mid+1;
            }
        }

        return left;
    }



//'2��С��O(n^2) ���ֲ���
//    ���ǲ�Ҫ��������,ֻ��Ҫ���� ���ֶ��� 1 �� n ֮��
//    ʾ�� 1:
//    arr = [1,3,4,2,2] ��ʱ������ 1 �� 5 ֮��
//
//            mid = (1 + 5) / 2 = 3 arrС�ڵ��ڵ�3��4��(1,2,2,3)��1��3�п϶����ظ���ֵ
//            mid = (1 + 3) / 2 = 2 arrС�ڵ��ڵ�2��3��(1,2,2)��1��2�п϶����ظ���ֵ
//            mid = (1 + 2) / 2 = 1 arrС�ڵ��ڵ�1��1��(1)��2��2�п϶����ظ���ֵ
//    �����ظ������� 2

    public int findDuplicate2(int[] nums) {
        int len = nums.length;
        int left = 1;
        int right = len - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;

            int cnt = 0;
            for (int num : nums) {
                if (num <= mid) {
                    cnt += 1;
                }
            }
            // ���ݳ���ԭ��С�ڵ��� 4 �ĸ�������ϸ���� 4 ������ʱ�ظ�Ԫ��һ�������� [1..4] ������
            if (cnt > mid) {
                // �ظ�Ԫ��λ������ [left..mid]
                right = mid;
            } else {
                // if ������ȷ���Ժ�else ������������� if �ķ������� [mid + 1..right]
                left = mid + 1;
            }
        }
        return left;
    }

    //����ָ��
    public int findDuplicate3(int[] nums) {
        /**
         ����ָ��˼��, fast �� slow ��ָ��, nums[slow] ��ʾȡָ���Ӧ��Ԫ��
         ע�� nums �����е����ֶ����� 1 �� n ֮���(�������н������߲���Խ��),
         ��Ϊ���ظ����ֵĳ���, ����������߱�Ȼ�ǳɻ���, ������ھ����ظ���Ԫ��,
         ������Ѱ��������ڵ�˼·����
         **/
        int fast = 0, slow = 0;
        while(true) {
            fast = nums[nums[fast]];
            slow = nums[slow];
            if(slow == fast) {
                fast = 0;
                while(nums[slow] != nums[fast]) {
                    fast = nums[fast];
                    slow = nums[slow];
                }
                return nums[slow];
            }
        }
    }
}
