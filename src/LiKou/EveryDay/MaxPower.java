package LiKou.EveryDay;

/**
 * @Author: liangfan
 * @Date: 2021-12-07 16:05
 * @Description: 给你一个字符串 s ，字符串的「能量」定义为：只包含一种字符的最长非空子字符串的长度。 请你返回字符串的能量。
 * 输入：s = "leetcode"
 * 输出：2
 * 解释：子字符串 "ee" 长度为 2 ，只包含字符 'e' 。
 */

public class MaxPower {
    public static void main(String[] args) {
        int sum = maxPower("j");
        System.out.println(sum);
    }
    public static int maxPower(String s) {
        int sum = 1, max = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                sum ++;
                max = Math.max(sum, max);
            } else {
                sum = 1;
            }
        }
        return max;
    }



}
