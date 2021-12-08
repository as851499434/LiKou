package LiKou.EveryDay;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Author: liangfan
 * @Date: 2021-12-07 16:29
 * @Description:给你一个长度为 n 的整数数组 score ，其中 score[i] 是第 i 位运动员在比赛中的得分。所有得分都 互不相同 。
 *
 * 运动员将根据得分 决定名次 ，其中名次第 1 的运动员得分最高，名次第 2 的运动员得分第 2 高，依此类推。运动员的名次决定了他们的获奖情况：
 *
 * 名次第 1 的运动员获金牌 "Gold Medal" 。
 * 名次第 2 的运动员获银牌 "Silver Medal" 。
 * 名次第 3 的运动员获铜牌 "Bronze Medal" 。
 * 从名次第 4 到第 n 的运动员，只能获得他们的名次编号（即，名次第 x 的运动员获得编号 "x"）。
 * 使用长度为 n 的数组 answer 返回获奖，其中 answer[i] 是第 i 位运动员的获奖情况。
 *
 * 输入：score = [10,3,8,9,4]
 * 输出：["Gold Medal","5","Bronze Medal","Silver Medal","4"]
 * 解释：名次为 [1st, 5th, 3rd, 2nd, 4th] 。

 */

public class FindRelativeRanks {
    public static void main(String[] args) {
//        int[] s = {5,4,3,2,1};//[1, 3, 5, 7, 8]
        int[] s = {10,3,8,9,4};//[3, 4, 8, 9, 10]

        String[] relativeRanks = findRelativeRanks2(s);
        System.out.println(Arrays.toString(relativeRanks));
    }
    public static String[] findRelativeRanks(int[] score) {
        int flag = 3;
        String[] s = new String[score.length];
        int[] s2 = Arrays.copyOf(score, score.length);
        for (int i = s2.length - 1 ; i >= 0; i--) {
            for (int j = 0; j < score.length; j++) {
                if (s2[i] == score[j]) {
                    if (i == score.length -1) {
                        s[j] = "Gold Medal";
                    } else if (i == score.length -2) {
                        s[j] = "Silver Medal";
                    } else if (i == score.length -3) {
                        s[j] = "Bronze Medal";
                    } else {
                        s[j] = String.valueOf(++flag);
                    }
                }
            }
        }
        return s;
    }


    public static String[] findRelativeRanks2(int[] score) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < score.length; i++) map.put(score[i],i);
        Arrays.sort(score);
        String[] s = new String[score.length];
        for (int i = score.length - 1; i >= 0; i--) {
            int value = map.get(score[i]);
            if (i == score.length - 1) s[map.get(score[i])] = "Gold Medal";
            else if (i == score.length - 2) s[map.get(score[i])] = "Silver Medal";
            else if (i == score.length - 3) s[map.get(score[i])] = "Bronze Medal";
            else s[map.get(score[i])] = String.valueOf(score.length - i);
        }

        return s;
    }
}
