package LiKou.EveryDay;

/**
 * @Author: liangfan
 * @Date: 2021-12-20 16:22
 * @Description: 只出现一次的数字
 */

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {2,2,1};
        int i = singleNumber(arr);
        System.out.println(i);
    }
    public static int singleNumber(int[] nums) {
        int i = 0;
        for (int num : nums) {
            i ^= num;
        }
        return i;
    }
}
