package LfLiKou.Simple;

import LfLiKou.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liangfan
 * @Date: 2021-12-28 11:38
 * @Description: 二叉树的前序遍历
 * 给你二叉树的根节点 root ，返回它节点值的 前序 遍历
 */

public class PreorderTraversal {
    List<Integer> list = new ArrayList<>();
    // 递归
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root != null) {
            list.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return list;
    }



}

