package LfLiKou.EveryDay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: liangfan
 * @Date: 2021-12-21 14:32
 * @Description:
 */

public class TargetIndices {
    public static void main(String[] args) {
        int[] arr = {1,2,5,2,3};
        List<Integer> integers = targetIndices(arr, 8);
        System.out.println(integers);
    }
    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                list.add(i);
            }
        }
        return list;
    }
}
