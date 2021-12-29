package LfLiKou.Simple;

import LfLiKou.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liangfan
 * @Date: 2021-12-28 11:38
 * @Description: ��������ǰ�����
 * ����������ĸ��ڵ� root ���������ڵ�ֵ�� ǰ��  ����  ���� ����
 *            1
 *        /      \
 *      2         3
 *    /  \      /   \
 *  4     5   6      7
 * �����������������㰴�� ���ڵ� -> ���� -> �Һ��� �ķ�ʽ����������������������������Ϊ 1 2 4 5 3 6 7��
 *
 * �����������������㰴�� ���� -> ���ڵ� -> �Һ��� �ķ�ʽ����������������������������Ϊ 4 2 5 1 6 3 7��
 *
 * �����������������㰴�� ���� -> �Һ��� -> ���ڵ� �ķ�ʽ����������������������������Ϊ 4 5 2 6 7 3 1��
 *
 * ��󣬲�α������ǰ���ÿһ��������ҵķ�ʽ���б������������Ϊ 1 2 3 4 5 6 7��
 */

public class Traversal {
    List<Integer> list = new ArrayList<>();

    /**
     * ǰ����� �ݹ�
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
     * ������� �ݹ�
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
     * ����� �ݹ�
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

