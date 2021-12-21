package LiKou.Division;

/**
 * @Author: liangfan
 * @Date: 2021-12-17 15:49
 * @Description: 287
 * 给定一个包含n + 1 个整数的数组nums ，其数字都在 1 到 n之间（包括 1 和 n），可知至少存在一个重复的整数。
 * 假设 nums 只有 一个重复的整数 ，找出 这个重复的数 。
 * 你设计的解决方案必须不修改数组 nums 且只用常量级 O(1) 的额外空间。
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



//'2、小于O(n^2) 二分查找
//    我们不要考虑数组,只需要考虑 数字都在 1 到 n 之间
//    示例 1:
//    arr = [1,3,4,2,2] 此时数字在 1 — 5 之间
//
//            mid = (1 + 5) / 2 = 3 arr小于等于的3有4个(1,2,2,3)，1到3中肯定有重复的值
//            mid = (1 + 3) / 2 = 2 arr小于等于的2有3个(1,2,2)，1到2中肯定有重复的值
//            mid = (1 + 2) / 2 = 1 arr小于等于的1有1个(1)，2到2中肯定有重复的值
//    所以重复的数是 2

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
            // 根据抽屉原理，小于等于 4 的个数如果严格大于 4 个，此时重复元素一定出现在 [1..4] 区间里
            if (cnt > mid) {
                // 重复元素位于区间 [left..mid]
                right = mid;
            } else {
                // if 分析正确了以后，else 搜索的区间就是 if 的反面区间 [mid + 1..right]
                left = mid + 1;
            }
        }
        return left;
    }

    //快慢指针
    public int findDuplicate3(int[] nums) {
        /**
         快慢指针思想, fast 和 slow 是指针, nums[slow] 表示取指针对应的元素
         注意 nums 数组中的数字都是在 1 到 n 之间的(在数组中进行游走不会越界),
         因为有重复数字的出现, 所以这个游走必然是成环的, 环的入口就是重复的元素,
         即按照寻找链表环入口的思路来做
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
