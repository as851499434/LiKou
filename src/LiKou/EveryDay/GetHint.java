package LiKou.EveryDay;

/**
 * @Author: liangfan
 * @Date: 2021-11-30 16:43
 * @Description: 299 猜数字游戏 中等难度
 * 输入: secret = "1807", guess = "7810"
 * 输出: "1A3B"
 * 解释: 数字和位置都对（公牛）用 '|' 连接，数字猜对位置不对（奶牛）的采用斜体加粗标识。
 * "1807"
 *   |
 * "7810" 1
 */

public class GetHint {
    public String getHint(String secret, String guess) {
        int a = 0;
        int b = 0;
        char[] quest = secret.toCharArray();
        char[] answer = guess.toCharArray();
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < quest.length; j++) {
                if (answer[i] == quest[j]) {
                    if (i == j) {
                        a++;
                    } else {
                        b++;
                    }
                    break;
                }
            }
        }
        return a + "A" + b + "B";
    }
}
