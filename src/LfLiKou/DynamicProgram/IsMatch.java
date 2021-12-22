package LfLiKou.DynamicProgram;

/**
 * @Author: liangfan
 * @Date: 2021-11-22 15:35
 * @Description: ������ʽƥ��
 * ��ʵ��һ����������ƥ�����'. '��'*'��������ʽ��ģʽ�е��ַ�'.'��ʾ����һ���ַ�����'*'��ʾ��ǰ����ַ����Գ�������Σ���0�Σ���
 * �ڱ����У�ƥ����ָ�ַ����������ַ�ƥ������ģʽ�����磬�ַ���"aaa"��ģʽ"a.a"��"ab*ac*a"ƥ�䣬����"aa.a"��"ab*a"����ƥ�䡣
 * ����:
 * s = "aa"
 * p = "a"
 * ���: false
 * ����: "a" �޷�ƥ�� "aa" �����ַ�����
 *
 * ����:
 * s = "aab"
 * p = "c*a*b"
 * ���: true
 * ����:��Ϊ '*' ��ʾ������������� 'c' Ϊ 0 ��, 'a' ���ظ�һ�Ρ���˿���ƥ���ַ��� "aab"��
 *
 * ����:
 * s = "mississippi"
 * p = "mis*is*p*."
 * ���: false
 */
public class IsMatch {
    public static void main(String[] args) {
        String s = "mississippi";
        String p = "mis*is*p*.";
        boolean match = isMatch(s, p);
        System.out.println(match);
    }
    public static boolean isMatch(String s, String p) {
        int m = s.length() + 1, n = p.length() + 1;
        boolean[][] dp = new boolean[m][n];
        dp[0][0] = true;
        // ��ʼ������
        for(int j = 2; j < n; j += 2) {
            dp[0][j] = dp[0][j - 2] && p.charAt(j - 1) == '*';
        }
        // ״̬ת��
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                if(p.charAt(j - 1) == '*') {
                    // 1.
                    if(dp[i][j - 2]) dp[i][j] = true;
                    // 2.
                    else if(dp[i - 1][j] && s.charAt(i - 1) == p.charAt(j - 2)) dp[i][j] = true;
                    // 3.
                    else if(dp[i - 1][j] && p.charAt(j - 2) == '.') dp[i][j] = true;
                } else {
                    // 1.
                    if(dp[i - 1][j - 1] && s.charAt(i - 1) == p.charAt(j - 1)) dp[i][j] = true;
                    // 2.
                    else if(dp[i - 1][j - 1] && p.charAt(j - 1) == '.') dp[i][j] = true;
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
