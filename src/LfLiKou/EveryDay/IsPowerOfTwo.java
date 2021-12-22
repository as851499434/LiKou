package LfLiKou.EveryDay;

/**
 * @Author: liangfan
 * @Date: 2021-12-14 11:23
 * @Description:
 * ����һ������ n�������жϸ������Ƿ��� 2 ���ݴη���
 * ����ǣ����� true �����򣬷��� false ��
 * �������һ������ x ʹ��n == 2 x ������Ϊ n �� 2 ���ݴη���
 */

public class IsPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        if ((n&(n-1)) == 0) return true;
        return false;
    }
}
