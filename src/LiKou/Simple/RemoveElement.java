package LiKou.Simple;

import java.util.Arrays;

/**
 * @Desc: 给你一个数组 nums和一个值 val，你需要 原地 移除所有数值等于val的元素，并返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
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

