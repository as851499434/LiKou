package LfLiKou.EveryDay;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: liangfan
 * @Date: 2022-01-07 09:58
 * @Description: ���ŵ����Ƕ�����
 *
 * ����ַ���������������֮һ������Գ�֮Ϊ ��Ч�����ַ�����valid parentheses string�����Լ�дΪ VPS����
 *
 * �ַ�����һ�����ַ��� ""��������һ����Ϊ "(" �� ")" �ĵ��ַ���
 * �ַ�������дΪ AB��A �� B�ַ������ӣ������� A �� B ���� ��Ч�����ַ��� ��
 * �ַ�������дΪ (A)������ A ��һ�� ��Ч�����ַ��� ��
 * ���Ƶأ����Զ����κ���Ч�����ַ���?S �� Ƕ����� depth(S)��
 *
 * depth("") = 0
 * depth(C) = 0������ C �ǵ����ַ����ַ������Ҹ��ַ����� "(" ���� ")"
 * depth(A + B) = max(depth(A), depth(B))������ A �� B ���� ��Ч�����ַ���
 * depth("(" + A + ")") = 1 + depth(A)������ A ��һ�� ��Ч�����ַ���
 * ���磺""��"()()"��"()(()())" ���� ��Ч�����ַ�����Ƕ����ȷֱ�Ϊ 0��1��2������ ")(" ��"(()" ������ ��Ч�����ַ��� ��
 *
 * ����һ�� ��Ч�����ַ��� s�����ظ��ַ����� s Ƕ����� ��
 *
 * ���룺s = "(1+(2*3)+((8)/4))+1"
 * �����3
 * ���룺s = "(1)+((2))+(((3)))"
 * �����3
 */

public class MaxDepth {
    public static void main(String[] args) {

    }
    // �������⣬��ʵ�������������������ŵ�������������ͨ�ַ������� ) �����󣩣�ֻ��Ҫ�߱�����ͳ�Ƽ��ɡ�
    public int maxDepth(String s) {
        int n = s.length(), ans = 0;
        for (int i = 0, cnt = 0; i < n; i++) {
            if (s.charAt(i) == '(') cnt++;
            else if (s.charAt(i) == ')') cnt--;
            ans = Math.max(ans, cnt);
        }
        return ans;
    }

}
