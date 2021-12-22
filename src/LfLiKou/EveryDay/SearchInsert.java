package LfLiKou.EveryDay;

/**
 * @Author: liangfan
 * @Date: 2021-12-14 15:37
 * @Description: 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 请必须使用时间复杂度为 O(log n) 的算法。
 */

public class SearchInsert {
    public static void main(String[] args) {
        int[] nums = {1,  3, 4, 5};

        System.out.println(searchInsert(nums,2));
        System.out.println(9%3);
    }
    public static int searchInsert(int[] nums, int target) {
        // 二分法
        int left = 0, right = nums.length - 1 ;
        while (left <= right) {
            // mid = (left + right) 防止 left+right 过大溢出
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
