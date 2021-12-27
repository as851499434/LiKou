package LfLiKou.Recursion;

import LfLiKou.ListNode;

/**
 * @Author: liangfan
 * @Date: 2021-12-24 15:14
 * @Description: 203 �Ƴ�����Ԫ��
 * ����һ�������ͷ�ڵ� head ��һ������ val ������ɾ���������������� Node.val == val �Ľڵ㣬������ �µ�ͷ�ڵ� ��
 */

public class RemoveElements {
    // �ݹ�
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        head.next = removeElements(head.next, val);

        return head.val == val ? head.next : head;
    }
}
