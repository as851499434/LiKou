package LfLiKou.DoublePointer;



import LfLiKou.ListNode;

import java.util.HashSet;

/**
 * @Author: liangfan
 * @Date: 2021-12-23 15:14
 * @Description: ��������
 *
 * ����һ�������ͷ�ڵ� head ���ж��������Ƿ��л���
 *
 * �����������ĳ���ڵ㣬����ͨ���������� next ָ���ٴε���������д��ڻ���
 * Ϊ�˱�ʾ���������еĻ�������ϵͳ�ڲ�ʹ������ pos ����ʾ����β���ӵ������е�λ�ã������� 0 ��ʼ����
 * ��� pos �� -1�����ڸ�������û�л���ע�⣺pos ����Ϊ�������д��ݣ�������Ϊ�˱�ʶ�����ʵ�������
 * ��������д��ڻ����򷵻� true �� ���򣬷��� false ��
 */

public class HasCycle {
    public static void main(String[] args) {

    }
    public static boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while (head != null) {
            if (!set.add(head)) return true;
            head = head.next;
        }

        return false;
    }
    // ����ָ��
    public static boolean hasCycle2(ListNode head) {
        ListNode quickNode  = head;
        while (head != null ) {
            if (head.next == null || quickNode.next.next == null ) return false;
            head = head.next;
            quickNode = quickNode.next.next;
            if (head == quickNode) return true;
        }
        return false;
    }
}


