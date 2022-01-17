package LfLiKou.EveryDay;

/**
 * @Author: liangfan
 * @Date: 2022-01-17 15:31
 * @Description: 计算力扣银行的钱
 * Hercy 想要为购买第一辆车存钱。他 每天 都往力扣银行里存钱。
 * 最开始，他在周一的时候存入 1块钱。从周二到周日，他每天都比前一天多存入 1块钱。在接下来每一个周一，他都会比 前一个周一 多存入 1块钱。
 * 给你n，请你返回在第 n天结束的时候他在力扣银行总共存了多少块钱。
 * 示例 2：
 * <p>
 * 输入：n = 10
 * 输出：37
 * 解释：第 10 天后，总额为 (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4) = 37 。注意到第二个星期一，Hercy 存入 2 块钱。
 */

public class TotalMoney {
    public static void main(String[] args) {
        TotalMoney totalMoney = new TotalMoney();

        System.out.println(totalMoney.totalMoney(26));
    }

    public int totalMoney(int n) {
//        int sum = 28;
//        if (n / 7 > 0) {
//            for (int i = 1; i < n / 7; i++) {
//                sum = sum*2 + 7;
//            }
//            return sum;
//        } else {
//            return (1+n)*n/2;
//        }
        int i = n / 7;
        int j = n % 7;
        return i > 0 ? (28 * i + (1+(i - 1))*(i - 1)/2 * 7) + ((1+j)*j/2 + (i * j)) : (1+n)*n/2;
//        1+2
//        2+3
//        3+4
//        4+5+6+7+8
    }
}
