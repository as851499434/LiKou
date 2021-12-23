package LfLiKou.Simple;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Author: liangfan
 * @Date: 2021-12-23 13:58
 * @Description: 387. �ַ����еĵ�һ��Ψһ�ַ�
 * ����һ���ַ������ҵ����ĵ�һ�����ظ����ַ���������������������������ڣ��򷵻� -1��
 * s = "leetcode"
 * ���� 0
 *
 * s = "loveleetcode"
 * ���� 2
 */

public class FirstUniqChar {
    public static void main(String[] args) {
        int a = firstUniqChar2("loveleetcode");
        System.out.println(a);
    }
    //��ɽ���
    public static int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                map.put(chars[i],map.get(chars[i]) + 1);
            } else {
                map.put(chars[i],1);
            }
        }
        for (Character c : map.keySet()) {
            if (map.get(c) == 1) {
                for (int i = 0; i < chars.length; i++) {
                    if (c == chars[i]) return i;
                }
            }
        }
        return -1;
    }

    //�Ż�
    public static int firstUniqChar2(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i],map.getOrDefault(chars[i],0) + 1);
        }
        for (int i = 0; i < chars.length; i++) {
            if (map.get(chars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}
