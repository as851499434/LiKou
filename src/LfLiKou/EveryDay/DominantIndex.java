package LfLiKou.EveryDay;

import java.util.Arrays;

/**
 * @Author: liangfan
 * @Date: 2022-01-13 09:19
 * @Description: 至少是其他数字两倍的最大数
 *
 * 给你一个整数数组 nums ，其中总是存在 唯一的 一个最大整数 。
 * 请你找出数组中的最大元素并检查它是否 至少是数组中每个其他数字的两倍 。如果是，则返回 最大元素的下标 ，否则返回 -1 。
 */

public class DominantIndex {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] nums2 = {0,0,3,2};
        int[] nums3 = {0,6,3,1};
        DominantIndex main = new DominantIndex();

        System.out.println(main.dominantIndex2(nums2));
    }
    public int dominantIndex(int[] nums) {
        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        if (nums.length > 1 ) {
            if (nums[nums.length-1] >= nums[nums.length-2] *2) {
                for (int i = 0; i < copy.length; i++) {
                    if (copy[i] == nums[nums.length-1]) return i;
                }
            } else {
                return -1;
            }
        }
        return 0;
    }

    public int dominantIndex2(int[] nums) {
        int max = Integer.MIN_VALUE, sendMax = Integer.MIN_VALUE, index = 0, flag = 0;
        for (int i = 0; i < nums.length && nums.length > 1; i++) {
            flag = -1;
            if (nums[i] > max) {
                sendMax = max;
                max = nums[i];
                index = i;
            } else if (nums[i] > sendMax ) {
                sendMax = nums[i];
            }
        }
        return max >= sendMax * 2 ? index : flag;
    }
}
