package LiKou.EveryDay;

/**
 * @Author: liangfan
 * @Date: 2021-12-14 11:38
 * @Description: �ж��Ƿ���������
 */

public class IsPowerOfThree {
    public boolean isPowerOfThree(int n) {
//        ѭ��
//        if (n <= 0) return false;
//        while (n % 3 == 0) n /= 3;
//        return n == 1;

//        �ݹ�
//        if (n <= 0) return false;
//        if (n == 1) return true;
//        return (n % 3 == 0) && isPowerOfThree(n / 3);

//        Լ��������
        return n > 0 && 1162261467 % n == 0 ;
    }
}
