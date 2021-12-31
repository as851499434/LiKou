package LfLiKou.Simple;

/**
 * @Author: liangfan
 * @Date: 2021-12-31 15:51
 * @Description: 507. ������
 * ����һ����������������ͳ������������������ ������ ֮����ȣ����ǳ���Ϊ ������������
 * ����һ������n������������������� true�����򷵻� false
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
