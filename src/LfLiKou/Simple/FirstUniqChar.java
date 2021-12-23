package LfLiKou.Simple;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Author: liangfan
 * @Date: 2021-12-23 13:58
 * @Description: 387. 字符串中的第一个唯一字符
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * s = "leetcode"
 * 返回 0
 *
 * s = "loveleetcode"
 * 返回 2
 */

public class FirstUniqChar {
    public static void main(String[] args) {
        int a = firstUniqChar2("loveleetcode");
        System.out.println(a);
    }
    //完成解题
    public static int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                map.put(chars[i],map.get(chars[i]) + 1);
            } else {
                map.put(chars[i],1);
            }
        }
        for (Character c : map.keySet()) {
            if (map.get(c) == 1) {
                for (int i = 0; i < chars.length; i++) {
                    if (c == chars[i]) return i;
                }
            }
        }
        return -1;
    }

    //优化
    public static int firstUniqChar2(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i],map.getOrDefault(chars[i],0) + 1);
        }
        for (int i = 0; i < chars.length; i++) {
            if (map.get(chars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}
