package LfLiKou.Simple;

import java.util.Arrays;

/**
 * @Author: liangfan
 * @Date: 2022-01-05 16:36
 * @Description: 替换所有的问号
 * 给你一个仅包含小写英文字母和 '?' 字符的字符串 s，请你将所有的 '?' 转换为若干小写字母，使最终的字符串不包含任何 连续重复 的字符。
 * 注意：你 不能 修改非 '?' 字符。
 * 题目测试用例保证 除 '?' 字符 之外，不存在连续重复的字符。
 * 在完成所有转换（可能无需转换）后返回最终的字符串。如果有多个解决方案，请返回其中任何一个。可以证明，在给定的约束条件下，答案总是存在的。
 *
 * 输入：s = "?zs"
 * 输出："azs"
 * 解释：该示例共有 25 种解决方案，从 "azs" 到 "yzs" 都是符合题目要求的。只有 "z" 是无效的修改，因为字符串 "zzs" 中有连续重复的两个 'z' 。
 *
 */

public class ModifyString {
    public static void main(String[] args) {
        String s = "??yw?ipkj?";
        char[] chars = s.toCharArray();
        System.out.println(modifyString(s));
    }
    public static String modifyString(String s) {
        char[] cs = s.toCharArray();
        int n = cs.length;
        for (int i = 0; i < n; i++) {
            for (int c = 0; c < 3 && cs[i] == '?'; c++) {
                boolean ok = true;
                if (i - 1 >= 0 && cs[i - 1] == c + 'a') ok = false;
                if (i + 1 < n && cs[i + 1] == c + 'a') ok = false;
                if (ok) cs[i] = (char)(c + 'a');
            }
        }
        return String.valueOf(cs);
    }


}
