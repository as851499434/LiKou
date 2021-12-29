package LfLiKou.Simple;

import LfLiKou.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liangfan
 * @Date: 2021-12-28 11:38
 * @Description: ��������ǰ�����
 * ����������ĸ��ڵ� root ���������ڵ�ֵ�� ǰ�� ����
 */

public class PreorderTraversal {
    List<Integer> list = new ArrayList<>();
    // �ݹ�
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root != null) {
            list.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return list;
    }



}

