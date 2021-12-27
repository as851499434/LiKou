package LfLiKou.Recursion;

import LfLiKou.ListNode;

/**
 * @Author: liangfan
 * @Date: 2021-12-24 16:57
 * @Description: 206 ��ת����
 * ���㵥�����ͷ�ڵ� head �����㷴ת���������ط�ת�������
 */

public class ReverseList {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = null;

        ReverseList reverseList = new ReverseList();
        System.out.println(reverseList.reverseList2(listNode1));
    }
    // �ݹ�
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    // ����
    public ListNode reverseList2(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
