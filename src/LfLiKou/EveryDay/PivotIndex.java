package LfLiKou.EveryDay;

import java.util.Arrays;

/**
 * @Author: liangfan
 * @Date: 2021-12-14 14:10
 * @Description: 给你一个整数数组nums ，请计算数组的 中心下标 。
 * 数组 中心下标 是数组的一个下标，其左侧所有元素相加的和等于右侧所有元素相加的和。
 * 如果中心下标位于数组最左端，那么左侧数之和视为 0 ，因为在下标的左侧不存在元素。这一点对于中心下标位于数组最右端同样适用。
 * 如果数组有多个中心下标，应该返回 最靠近左边 的那一个。如果数组不存在中心下标，返回 -1 。
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
