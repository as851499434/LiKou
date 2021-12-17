package LiKou.EveryDay;

/**
 * @Author: liangfan
 * @Date: 2021-12-16 15:38
 * @Description:
 *
 * 大写字母 {A - Z} A-Z 的 {ASCII}ASCII 码范围为  [65,90]：
 * 小写字母 {a - z} a-z 的 {ASCII}ASCII 码范围为 [97,122]。
 *
 * 全转小写：ch|=32
 * 全转大写：ch&=-33 (原理是32的补码（原码取反+1）再-1)
 * 大小写对换（大写变小写，小写变大）ch^=32
 *
 * 十进制数-33：
 * 先把33转换成二进制：33D=0100001B
 * 因为是负数,在最前面加上一个1,得到原码：1010 0001
 * 反码：符号位不变,其余按位取反：1101 1110
 * 补码：反码+1=1101 1111
 *
 * 65 0100 0001  96 0101 1010    97   0101 1011
 * 32 0010 0000                       1110 0000
 */

public class ToLowerCase {
    public static void main(String[] args) {
        ToLowerCase toLowerCase = new ToLowerCase();

        System.out.println(toLowerCase.toLowerCase("ttttt"));
    }

    public String toLowerCase(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 65 && c <= 90) {
                c |= 32;
            } else {
                c &= -33;
            }
            str.append(c) ;
        }
        return str.toString();
    }

    public String toLowerCase2(String s) {
        return s.toLowerCase();
    }
}
