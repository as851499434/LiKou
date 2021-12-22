package LiKou.EveryDay;

import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: liangfan
 * @Date: 2021-12-22 10:31
 * @Description:
 * 给你两个整数数组nums1 和 nums2 ，请你以数组形式返回两数组的交集。返回结果中每个元素出现的次数，
 * 应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。可以不考虑输出结果的顺序。
 *
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2,2]
 */

public class Intersect {
    public static void main(String[] args) {

        Date date = new Date();
        DateFormat df3 = DateFormat.getDateTimeInstance();
        String format = df3.format(date);
        System.out.println(format);
        System.out.println(date);
        int[] arr = {9,4,9,8,4};
        int[] arr2 = {4,9,5};

        System.out.println(Arrays.toString(intersect(arr,arr2)));
        System.out.println(Arrays.toString(intersect2(arr,arr2)));
    }
    // 1.hash表
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])) {
                map.put(nums1[i], map.get(nums1[i]) + 1);
            } else {
                map.put(nums1[i],1);
            }
        }
        int[] arr = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) != 0) {
                map.put(nums2[i], map.get(nums2[i]) - 1);
                arr[index] = nums2[i];
                index++;
            }
        }
        return Arrays.copyOf(arr,index);
    }

    // 2.双指针
    public static int[] intersect2(int[] nums1, int[] nums2) {
        int[] arr = new int[Math.min(nums1.length, nums2.length)];
        int left = 0, left2 = 0, index = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(left < nums1.length && left2 < nums2.length) {
            if (nums1[left] < nums2[left2]) {
                left++;
            } else if (nums1[left] > nums2[left2]) {
                left2++;
            } else { //if (nums1[left] == nums2[left2])
                arr[index] = nums1[left];
                index++;
                left++;
                left2++;
            }
        }
        return Arrays.copyOf(arr,index);
    }
}
