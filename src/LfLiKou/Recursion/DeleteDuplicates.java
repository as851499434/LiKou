package LfLiKou.Recursion;

import LfLiKou.ListNode;

import java.util.List;

/**
 * @Author: liangfan
 * @Date: 2021-12-27 14:00
 * @Description: 删除排序链表中的重复元素
 * 存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除所有重复的元素，使每个元素 只出现一次
 * 返回同样按升序排列的结果链表。
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
    // 迭代
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
