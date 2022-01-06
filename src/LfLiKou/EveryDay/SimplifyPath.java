package LfLiKou.EveryDay;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

/**
 * @Author: liangfan
 * @Date: 2022-01-06 09:52
 * @Description: ��·�� (linux)
 *
 * ����һ���ַ��� path ����ʾָ��ĳһ�ļ���Ŀ¼��Unix ��� ����·�� ���� '/' ��ͷ�������㽫��ת��Ϊ���Ӽ��Ĺ淶·����
 * �� Unix �����ļ�ϵͳ�У�һ���㣨.����ʾ��ǰĿ¼�������⣬������ ��..����ʾ��Ŀ¼�л�����һ����ָ��Ŀ¼�������߶������Ǹ������·������ɲ��֡�
 * ������������б�ܣ�����'//'��������Ϊ����б�� '/' �� ���ڴ����⣬�κ�������ʽ�ĵ㣨���磬'...'��������Ϊ�ļ�/Ŀ¼���ơ�
 *
 * ��ע�⣬���ص� �淶·�� ������ѭ������ʽ��
 * ʼ����б�� '/' ��ͷ��
 * ����Ŀ¼��֮�����ֻ��һ��б�� '/' ��
 * ���һ��Ŀ¼����������ڣ����� �� '/' ��β��
 * ���⣬·���������Ӹ�Ŀ¼��Ŀ���ļ���Ŀ¼��·���ϵ�Ŀ¼���������� '.' �� '..'����
 * ���ؼ򻯺�õ��� �淶·�� ��
 */

public class SimplifyPath {
    public static void main(String[] args) {
        String s = "/../";
        System.out.println(simplifyPath(s) );
    }
    public static String simplifyPath(String path) {
        Deque<String> deque = new LinkedList<>();
        String[] split = path.split("/");
        for (int i = 0; i < split.length; i++) {
            if ("..".equals(split[i])  ) {
                if (deque.size() != 0) deque.removeLast();
            } else if (".".equals(split[i])) {
                continue;
            } else if (!"".equals(split[i])) {
                deque.addLast(split[i]);
            }
        }
        StringBuffer str = new StringBuffer("/");

        while (!deque.isEmpty()) {
            str.append(deque.pollFirst());
            if (deque.size() != 0) str.append("/");
        }

        return str.toString();
    }
}
