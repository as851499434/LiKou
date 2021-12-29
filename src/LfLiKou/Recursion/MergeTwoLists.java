package LfLiKou.Recursion;

import LfLiKou.ListNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @Author: liangfan
 * @Date: 2021-11-18 13:29
 * @Description: 21 合并两个有序链表
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * <p>
 * 输入：l1 = [1,2,4], l2 = [1,3,4]
 * 输出：[1,1,2,3,4,4]
 */
public class MergeTwoLists {
    public static void main(String[] args) {
        Queue<Object> queqe = new LinkedList<>();
        Deque<Object> deque = new LinkedList<>();
        Stack<Object> stack = new Stack<>();
        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);
        System.out.println(deque);
        System.out.println(deque.peek());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println(stack.peek());
    }

    // 递归
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val > l2.val) {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        } else {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
    }

    // 双指针
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        return l1;
    }
}

//用栈实现队列
class MyQueue {
    Deque<Integer> stack1;
    Deque<Integer> stack2;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        stack1.addLast(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        peek();
        return stack2.removeLast();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.addLast(stack1.removeLast());
            }
        }
        return stack2.peekLast();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}



