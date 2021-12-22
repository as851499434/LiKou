package LfLiKou.DynamicProgram;

/**
 * @Author: liangfan
 * @Date: 2021-11-18 13:29
 * @Description:
 * ÊäÈë£ºl1 = [1,2,4], l2 = [1,3,4]
 * Êä³ö£º[1,1,2,3,4,4]
 */
public class MergeTwoLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val > l2.val) {
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        } else {
            l1.next = mergeTwoLists(l1.next, l2);

            return l1;
        }


    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
