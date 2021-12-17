package LiKou.EveryDay;

/**
 * @Author: liangfan
 * @Date: 2021-12-16 15:38
 * @Description:
 *
 * ��д��ĸ {A - Z} A-Z �� {ASCII}ASCII �뷶ΧΪ  [65,90]��
 * Сд��ĸ {a - z} a-z �� {ASCII}ASCII �뷶ΧΪ [97,122]��
 *
 * ȫתСд��ch|=32
 * ȫת��д��ch&=-33 (ԭ����32�Ĳ��루ԭ��ȡ��+1����-1)
 * ��Сд�Ի�����д��Сд��Сд���ch^=32
 *
 * ʮ������-33��
 * �Ȱ�33ת���ɶ����ƣ�33D=0100001B
 * ��Ϊ�Ǹ���,����ǰ�����һ��1,�õ�ԭ�룺1010 0001
 * ���룺����λ����,���ఴλȡ����1101 1110
 * ���룺����+1=1101 1111
 *
 * 65 0100 0001  96 0101 1010    97   0101 1011
 * 32 0010 0000                       1110 0000
 */

public class ToLowerCase {
    public static void main(String[] args) {
        ToLowerCase toLowerCase = new ToLowerCase();

        System.out.println(toLowerCase.toLowerCase("ttttt"));
    }

    public String toLowerCase(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 65 && c <= 90) {
                c |= 32;
            } else {
                c &= -33;
            }
            str.append(c) ;
        }
        return str.toString();
    }

    public String toLowerCase2(String s) {
        return s.toLowerCase();
    }
}
