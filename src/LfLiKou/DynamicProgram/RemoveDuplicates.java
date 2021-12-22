package LfLiKou.DynamicProgram;

/**
 * @Author: liangfan
 * @Date: 2021-11-18 13:45
 * @Description:
 * ����һ���������� nums ������ ԭ�� ɾ���ظ����ֵ�Ԫ�أ�ʹÿ��Ԫ�� ֻ����һ�� ������ɾ����������³��ȡ�
 * ��Ҫʹ�ö��������ռ䣬������� ԭ�� �޸��������� ����ʹ�� O(1) ����ռ����������ɡ�
 *
 * ��Դ�����ۣ�LeetCode��
 * ���ӣ�https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
 * ����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
 * ���룺nums = [1,1,2]
 * �����2, nums = [1,2]
 * ���ͣ�����Ӧ�÷����µĳ��� 2 ������ԭ���� nums ��ǰ����Ԫ�ر��޸�Ϊ 1, 2 ������Ҫ���������г����³��Ⱥ����Ԫ�ء�
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] ints = {-3,-1,0,0,0,3,3};
        int i = removeDuplicates(ints);
        System.out.println(i);
    }
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int fast = 1, slow = 1;
        while (fast < n) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;



//        int t = 0;
//        for (int i = 0; i < nums.length; i ++ ) {
//            if (i == 0 || nums[i] != nums[i - 1]) {
//                nums[t ++ ] = nums[i];
//            }
//        }
//        System.out.println(Arrays.toString(nums));
//        return t;
    }
}
