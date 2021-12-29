package LfLiKou.Simple;

import LfLiKou.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liangfan
 * @Date: 2021-12-28 11:38
 * @Description: 二叉树的前序遍历
 * 给你二叉树的根节点 root ，返回它节点值的 前序  中序  后序 遍历
 *            1
 *        /      \
 *      2         3
 *    /  \      /   \
 *  4     5   6      7
 * 「先序遍历」：如果你按照 根节点 -> 左孩子 -> 右孩子 的方式遍历，即「先序遍历」，遍历结果为 1 2 4 5 3 6 7；
 *
 * 「中序遍历」：如果你按照 左孩子 -> 根节点 -> 右孩子 的方式遍历，即「中序遍历」，遍历结果为 4 2 5 1 6 3 7；
 *
 * 「后序遍历」：如果你按照 左孩子 -> 右孩子 -> 根节点 的方式遍历，即「后序遍历」，遍历结果为 4 5 2 6 7 3 1；
 *
 * 最后，层次遍历就是按照每一层从左向右的方式进行遍历，遍历结果为 1 2 3 4 5 6 7。
 */

public class Traversal {
    List<Integer> list = new ArrayList<>();

    /**
     * 前序遍历 递归
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        preorder(root, res);
        return res;
    }
    public void preorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        preorder(root.left, res);
        preorder(root.right, res);
    }


    /**
     * 中序遍历 递归
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        inorder(root, res);
        return res;
    }

    public void inorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }
    /**
     * 后遍历 递归
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        postorder(root, res);
        return res;
    }

    public void postorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        postorder(root.left, res);
        postorder(root.right, res);
        res.add(root.val);
    }


}

