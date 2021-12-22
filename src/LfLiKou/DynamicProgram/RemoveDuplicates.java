package LfLiKou.DynamicProgram;

/**
 * @Author: liangfan
 * @Date: 2021-11-18 13:45
 * @Description:
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 输入：nums = [1,1,2]
 * 输出：2, nums = [1,2]
 * 解释：函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2 。不需要考虑数组中超出新长度后面的元素。
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
