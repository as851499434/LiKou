package LfLiKou.Simple;

import java.util.Arrays;

/**
 * @Author: liangfan
 * @Date: 2021-12-23 14:56
 * @Description: ��Ч����ĸ��λ��
 * ���������ַ��� s �� t ����дһ���������ж� t �Ƿ��� s ����ĸ��λ�ʡ�
 * ע�⣺��s �� t��ÿ���ַ����ֵĴ�������ͬ�����s �� t��Ϊ��ĸ��λ�ʡ�
 * ����: s = "anagram", t = "nagaram"
 * ���: true
 * ����: s = "rat", t = "car"
 * ���: false
 */

public class IsAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram2("anagram", "nagaram"));
        System.out.println(isAnagram2("anagramb", "nagaram"));
    }
    // ���� �����鵱��ϣ
    public static boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            if(--arr[c - 'a'] < 0) return false;
        }
        if (Arrays.stream(arr).sum() != 0) {
            return false;
        }
        return true;
    }
    //����
    public static boolean isAnagram2(String s, String t) {
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }
}
