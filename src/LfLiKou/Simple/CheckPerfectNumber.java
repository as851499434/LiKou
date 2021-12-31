package LfLiKou.Simple;

/**
 * @Author: liangfan
 * @Date: 2021-12-31 15:51
 * @Description: 507. 完美数
 * 对于一个正整数，如果它和除了它自身以外的所有 正因子 之和相等，我们称它为 「完美数」。
 * 给定一个整数n，如果是完美数，返回 true，否则返回 false
 */

public class CheckPerfectNumber {
    public static void main(String[] args) {
        CheckPerfectNumber checkPerfectNumber = new CheckPerfectNumber();
        boolean b = checkPerfectNumber.checkPerfectNumber(28);
        System.out.println(b);

    }

    public boolean checkPerfectNumber(int num) {
        if (num == 1) return false;
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if ( i * i < num)  sum += num/i;
            }
        }
        return sum == num;
    }



}
