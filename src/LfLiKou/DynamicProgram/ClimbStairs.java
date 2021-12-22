package LfLiKou.DynamicProgram;

/**
 * @Author: liangfan
 * @Date: 2021-12-21 14:49
 * @Description: 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 注意：给定 n 是一个正整数。
 */

public class ClimbStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(44));
    }

    //动态规划
    public static int climbStairs(int n) {
        // b过渡值
        int a = 0, b = 0, sum = 1;
        for (int i = 0; i < n; i++) {
            a = b;
            b = sum;
            sum = a + b;
        }
        return sum;
    }

    //记忆递归
    public static int climbStairs2(int n) {
        int[] arr = new int[n + 1];
        if (n == 0 || n == 1 || n == 2) {
            return n;
        } else if (arr[n] != 0) {
            return arr[n];
        } else {
            return arr[n] = climbStairs2(n - 1) + climbStairs2(n - 2);
        }

    }
}
