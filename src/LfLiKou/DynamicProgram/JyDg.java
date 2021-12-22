package LfLiKou.DynamicProgram;

/**
 * @Author: liangfan
 * @Date: 2021-11-18 11:05
 * @Description: 记忆递归 斐波那契数列
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 */
public class JyDg {
    int[] fibs = new int[101];
    public int fib(int n) {
        if(n == 0 || n == 1) {
            return n;
        }else if(fibs[n] != 0){
            return fibs[n];
        }else{
            return fibs[n] = (fib(n-1) + fib(n-2)) % 1000000007;
        }
    }
}
