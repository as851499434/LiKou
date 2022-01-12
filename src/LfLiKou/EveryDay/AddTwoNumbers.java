package LfLiKou.EveryDay;

import LfLiKou.ListNode;

/**
 * @Author: liangfan
 * @Date: 2022-01-12 15:47
 * @Description: �������
 * ���������ǿ� ��������ʾ�����Ǹ�������������ÿλ���ֶ��ǰ�������ķ�ʽ�洢�ģ�����ÿ���ڵ�ֻ�ܴ洢һλ���֡�
 * ���㽫��������ӣ�������ͬ��ʽ����һ����ʾ�͵�����
 * ����Լ���������� 0 ֮�⣬���������������� 0��ͷ��
 *
 * ���룺l1 = [2,4,3], l2 = [5,6,4]
 * �����[7,0,8]
 * ���ͣ�342 + 465 = 807.
 * ʾ�� 2��
 *
 * ���룺l1 = [0], l2 = [0]
 * �����[0]
 * ʾ�� 3��
 *
 * ���룺l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * �����[8,9,9,9,0,0,0,1]
 */

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val = 0, flag = 0;
        ListNode root = new ListNode(0);
        ListNode listNode = root;
        while (l1 != null || l2 != null || flag != 0) {
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;
            val = l1Val + l2Val + flag;
            flag = val/10;
            ListNode nextNode = new ListNode(val % 10);
            listNode.next = nextNode;
            listNode = nextNode;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return root.next;
    }
}
