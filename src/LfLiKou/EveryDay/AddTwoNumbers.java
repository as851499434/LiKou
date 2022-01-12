package LfLiKou.EveryDay;

import LfLiKou.ListNode;

/**
 * @Author: liangfan
 * @Date: 2022-01-12 15:47
 * @Description:
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
