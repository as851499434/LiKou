package LfLiKou.EveryDay;

/**
 * @Author: liangfan
 * @Date: 2021-12-14 11:23
 * @Description:
 * 给你一个整数 n，请你判断该整数是否是 2 的幂次方。
 * 如果是，返回 true ；否则，返回 false 。
 * 如果存在一个整数 x 使得n == 2 x ，则认为 n 是 2 的幂次方。
 */

public class IsPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        if ((n&(n-1)) == 0) return true;
        return false;
    }
}
