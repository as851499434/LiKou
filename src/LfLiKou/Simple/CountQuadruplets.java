package LfLiKou.Simple;

/**
 * @Author: liangfan
 * @Date: 2021-12-29 11:00
 * @Description: 给你一个 下标从 0 开始 的整数数组 nums ，返回满足下述条件的 不同 四元组 (a, b, c, d) 的 数目 ：
 * nums[a] + nums[b] + nums[c] == nums[d] ，且
 * a < b < c < d
 * 输入：nums = [1,1,1,3,5]
 * 输出：4
 * 解释：满足要求的 4 个四元组如下：
 * - (0, 1, 2, 3): 1 + 1 + 1 == 3
 * - (0, 1, 3, 4): 1 + 1 + 3 == 5
 * - (0, 2, 3, 4): 1 + 1 + 3 == 5
 * - (1, 2, 3, 4): 1 + 1 + 3 == 5
 */

public class CountQuadruplets {
    public static void main(String[] args) {
        System.out.println(new CountQuadruplets().countQuadruplets(new int[]{1, 1, 1, 3, 5}));
    }
    // 暴力
    public int countQuadruplets(int[] nums) {
        int n = nums.length, ans = 0;
        for (int a = 0; a < n; a++) {
            for (int b = a + 1; b < n; b++) {
                for (int c = b + 1; c < n; c++) {
                    for (int d = c + 1; d < n; d++) {
                        if (nums[a] + nums[b] + nums[c] == nums[d]) ans++;
                    }
                }
            }
        }
        return ans;
    }

    // TODO 哈希 背包
}
