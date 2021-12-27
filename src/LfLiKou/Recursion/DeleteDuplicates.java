package LfLiKou.Recursion;

import LfLiKou.ListNode;

import java.util.List;

/**
 * @Author: liangfan
 * @Date: 2021-12-27 14:00
 * @Description: ɾ�����������е��ظ�Ԫ��
 * ����һ�����������е�����������������ͷ�ڵ� head ������ɾ�������ظ���Ԫ�أ�ʹÿ��Ԫ�� ֻ����һ��
 * ����ͬ�����������еĽ������
 */

public class DeleteDuplicates {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(1);
        ListNode listNode4 = new ListNode(5);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = null;

        DeleteDuplicates reverseList = new DeleteDuplicates();
        System.out.println(reverseList.deleteDuplicates(listNode1));
    }
    // ����
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while ( curr != null && curr.next != null) {
            if ((curr.val ^ curr.next.val) == 0) {
                curr.next = curr.next.next;
                continue;
            }
            curr = curr.next;
        }
        return head;
    }



}
