package LfLiKou.Simple;

import java.util.Arrays;

/**
 * @Author: liangfan
 * @Date: 2022-01-05 16:36
 * @Description: �滻���е��ʺ�
 * ����һ��������СдӢ����ĸ�� '?' �ַ����ַ��� s�����㽫���е� '?' ת��Ϊ����Сд��ĸ��ʹ���յ��ַ����������κ� �����ظ� ���ַ���
 * ע�⣺�� ���� �޸ķ� '?' �ַ���
 * ��Ŀ����������֤ �� '?' �ַ� ֮�⣬�����������ظ����ַ���
 * ���������ת������������ת�����󷵻����յ��ַ���������ж������������뷵�������κ�һ��������֤�����ڸ�����Լ�������£������Ǵ��ڵġ�
 *
 * ���룺s = "?zs"
 * �����"azs"
 * ���ͣ���ʾ������ 25 �ֽ���������� "azs" �� "yzs" ���Ƿ�����ĿҪ��ġ�ֻ�� "z" ����Ч���޸ģ���Ϊ�ַ��� "zzs" ���������ظ������� 'z' ��
 *
 */

public class ModifyString {
    public static void main(String[] args) {
        String s = "??yw?ipkj?";
        char[] chars = s.toCharArray();
        System.out.println(modifyString(s));
    }
    public static String modifyString(String s) {
        char[] cs = s.toCharArray();
        int n = cs.length;
        for (int i = 0; i < n; i++) {
            for (int c = 0; c < 3 && cs[i] == '?'; c++) {
                boolean ok = true;
                if (i - 1 >= 0 && cs[i - 1] == c + 'a') ok = false;
                if (i + 1 < n && cs[i + 1] == c + 'a') ok = false;
                if (ok) cs[i] = (char)(c + 'a');
            }
        }
        return String.valueOf(cs);
    }


}
