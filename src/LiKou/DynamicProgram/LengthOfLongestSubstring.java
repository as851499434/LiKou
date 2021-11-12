package LiKou.DynamicProgram;

import java.util.HashMap;

/**
 * @Author: liangfan
 * @Date: 2021-11-11 16:26
 * @Description: 最长不重复字符串的长度
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int maxLength = 0;
        int leftIndex = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                leftIndex = Math.max(leftIndex, map.get(s.charAt(i)) + 1);
            }
            map.put(chars[i],i);
            maxLength = Math.max(i - leftIndex + 1 , maxLength);
        }
        return maxLength;
    }
}
