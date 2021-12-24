package LfLiKou.DoublePointer;



import LfLiKou.ListNode;

import java.util.HashSet;

/**
 * @Author: liangfan
 * @Date: 2021-12-23 15:14
 * @Description: 环形链表
 *
 * 给你一个链表的头节点 head ，判断链表中是否有环。
 *
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。
 * 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
 * 如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
 * 如果链表中存在环，则返回 true 。 否则，返回 false 。
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
    // 快慢指针
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


