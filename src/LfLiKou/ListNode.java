package LfLiKou;

/**
 * @Author: liangfan
 * @Date: 2021-12-23 15:19
 * @Description:
 */

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        val = val;
        next = null;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
