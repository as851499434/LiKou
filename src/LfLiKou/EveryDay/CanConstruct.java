package LfLiKou.EveryDay;

/**
 * @Author: liangfan
 * @Date: 2021-12-13 14:11
 * @Description: 给你两个字符串：
 * ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
 * 如果可以，返回 true ；否则返回 false 。
 * magazine 中的每个字符只能在 ransomNote 中使用一次。
 *
 * 输入：ransomNote = "a", magazine = "b"
 * 输出：false
 * 输入：ransomNote = "aa", magazine = "ab"
 * 输出：false
 * 输入：ransomNote = "aa", magazine = "aab"
 * 输出：true
 */

public class CanConstruct {
    public static void main(String[] args) {
        String s = "bg";
        String s2 = "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj";
        boolean b = canConstruct2(s, s2);
        System.out.println(b);
    }
    //再做一遍
    public static boolean canConstruct2(String a, String b) {
        int[] arr = new int[26];
        for (char c : b.toCharArray()) {
            arr[c - 'a']++;
        }
        for (char c : a.toCharArray()) {
            if (--arr[c-'a'] < 0) return false;
        }
        return true;
    }

    /**
     * 根据题意并利用两字符串只包含小写字母，先使用大小为字符集大小的数组（充当哈希表）对 magazinemagazine 进行词频统计，
     * 然后在遍历 ransomNoteransomNote 时对计数数组进行抵消操作。
     * 若处理过程中出现词频数量为负数，则说明 magazinemagazine 不能凑出 ransomNoteransomNote。
     */
    public static boolean canConstruct(String a, String b) {
        int[] cnt = new int[26];
        for (char c : b.toCharArray()) {
            cnt[c - 'a']++;
        }
        for (char c : a.toCharArray()) {
            if (--cnt[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

}
