package LiKou.Simple;

import java.util.Arrays;

/**
 * @Desc: ����һ������ nums��һ��ֵ val������Ҫ ԭ�� �Ƴ�������ֵ����val��Ԫ�أ��������Ƴ���������³��ȡ�
 * ��Ҫʹ�ö��������ռ䣬������ʹ�� O(1) ����ռ䲢 ԭ�� �޸��������顣
 * Ԫ�ص�˳����Ըı䡣�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�
 * @Author: lianfgan
 * @create: 2021-11-30 14:33
 **/

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int ints = removeElement(nums, 3);
        System.out.println((ints));
//        System.out.println(Arrays.toString(ints));
    }
    public static int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length ;
        while (left < right) {
            if (nums[left] != val) {
                left++;
            } else {
                nums[left] = nums[right-1];
                right--;
            }
        }
        return left;
    }
}

