package LfLiKou.EveryDay;

import java.util.Arrays;

/**
 * @Author: liangfan
 * @Date: 2022-01-12 09:06
 * @Description: 递增的三元子序列
 *
 * 给你一个整数数组nums ，判断这个数组中是否存在长度为 3 的递增子序列。
 *
 * 如果存在这样的三元组下标 (i, j, k)且满足 i < j < k ，使得nums[i] < nums[j] < nums[k] ，返回 true ；否则，返回 false 。
 */

public class IncreasingTriplet {
    public static void main(String[] args) {
        int[] ints = {20,5,10,12,100,13};

        System.out.println(increasingTriplet(ints));
    }
    public static boolean increasingTriplet(int[] nums) {
        /**
         a 记录最小的元素，b记录第二小的元素，如果出现第三小的元素，说明满足了条件
         */
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        for (int e : nums) {
            if (e <= a) {
                a = e;
            } else if (e <= b) {
                b = e;
            } else {
                return true;
            }
        }
        return false;
    }
}
