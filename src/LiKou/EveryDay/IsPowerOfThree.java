package LiKou.EveryDay;

/**
 * @Author: liangfan
 * @Date: 2021-12-14 11:38
 * @Description: 判断是否是三的幂
 */

public class IsPowerOfThree {
    public boolean isPowerOfThree(int n) {
//        循环
//        if (n <= 0) return false;
//        while (n % 3 == 0) n /= 3;
//        return n == 1;

//        递归
//        if (n <= 0) return false;
//        if (n == 1) return true;
//        return (n % 3 == 0) && isPowerOfThree(n / 3);

//        约数，倍数
        return n > 0 && 1162261467 % n == 0 ;
    }
}
