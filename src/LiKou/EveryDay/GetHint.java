package LiKou.EveryDay;

/**
 * @Author: liangfan
 * @Date: 2021-11-30 16:43
 * @Description: 299 ��������Ϸ �е��Ѷ�
 * ����: secret = "1807", guess = "7810"
 * ���: "1A3B"
 * ����: ���ֺ�λ�ö��ԣ���ţ���� '|' ���ӣ����ֲ¶�λ�ò��ԣ���ţ���Ĳ���б��Ӵֱ�ʶ��
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
