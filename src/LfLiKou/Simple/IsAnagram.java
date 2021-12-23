package LfLiKou.Simple;

import java.util.Arrays;

/**
 * @Author: liangfan
 * @Date: 2021-12-23 14:56
 * @Description: 有效的字母异位词
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * 注意：若s 和 t中每个字符出现的次数都相同，则称s 和 t互为字母异位词。
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 输入: s = "rat", t = "car"
 * 输出: false
 */

public class IsAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram2("anagram", "nagaram"));
        System.out.println(isAnagram2("anagramb", "nagaram"));
    }
    // 计数 用数组当哈希
    public static boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            if(--arr[c - 'a'] < 0) return false;
        }
        if (Arrays.stream(arr).sum() != 0) {
            return false;
        }
        return true;
    }
    //排序
    public static boolean isAnagram2(String s, String t) {
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }
}
