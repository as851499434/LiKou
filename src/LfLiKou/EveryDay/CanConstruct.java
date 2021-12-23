package LfLiKou.EveryDay;

/**
 * @Author: liangfan
 * @Date: 2021-12-13 14:11
 * @Description: ���������ַ�����
 * ransomNote �� magazine ���ж� ransomNote �ܲ����� magazine ������ַ����ɡ�
 * ������ԣ����� true �����򷵻� false ��
 * magazine �е�ÿ���ַ�ֻ���� ransomNote ��ʹ��һ�Ρ�
 *
 * ���룺ransomNote = "a", magazine = "b"
 * �����false
 * ���룺ransomNote = "aa", magazine = "ab"
 * �����false
 * ���룺ransomNote = "aa", magazine = "aab"
 * �����true
 */

public class CanConstruct {
    public static void main(String[] args) {
        String s = "bg";
        String s2 = "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj";
        boolean b = canConstruct2(s, s2);
        System.out.println(b);
    }
    //����һ��
    public static boolean canConstruct2(String a, String b) {
        int[] arr = new int[26];
        for (char c : b.toCharArray()) {
            arr[c - 'a']++;
        }
        for (char c : a.toCharArray()) {
            if (--arr[c-'a'] < 0) return false;
        }
        return true;
    }

    /**
     * �������Ⲣ�������ַ���ֻ����Сд��ĸ����ʹ�ô�СΪ�ַ�����С�����飨�䵱��ϣ���� magazinemagazine ���д�Ƶͳ�ƣ�
     * Ȼ���ڱ��� ransomNoteransomNote ʱ�Լ���������е���������
     * ����������г��ִ�Ƶ����Ϊ��������˵�� magazinemagazine ���ܴճ� ransomNoteransomNote��
     */
    public static boolean canConstruct(String a, String b) {
        int[] cnt = new int[26];
        for (char c : b.toCharArray()) {
            cnt[c - 'a']++;
        }
        for (char c : a.toCharArray()) {
            if (--cnt[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

}
