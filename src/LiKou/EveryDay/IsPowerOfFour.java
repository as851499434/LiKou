package LiKou.EveryDay;

/**
 * @Author: liangfan
 * @Date: 2021-12-16 09:31
 * @Description:
 */

public class IsPowerOfFour {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(15));

    }
    public static boolean isPowerOfFour(int n) {
//        if (n <= 0) return false;
//        while (n % 4 == 0) {
//            n /= 4;
//        }
//        return n == 1;

        if (n <= 0) return false;
        if (n == 1) return true;
        return n % 4 == 0 && isPowerOfFour(n/4);
    }
}
