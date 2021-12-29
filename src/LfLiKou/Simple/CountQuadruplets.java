package LfLiKou.Simple;

/**
 * @Author: liangfan
 * @Date: 2021-12-29 11:00
 * @Description: ����һ�� �±�� 0 ��ʼ ���������� nums �������������������� ��ͬ ��Ԫ�� (a, b, c, d) �� ��Ŀ ��
 * nums[a] + nums[b] + nums[c] == nums[d] ����
 * a < b < c < d
 * ���룺nums = [1,1,1,3,5]
 * �����4
 * ���ͣ�����Ҫ��� 4 ����Ԫ�����£�
 * - (0, 1, 2, 3): 1 + 1 + 1 == 3
 * - (0, 1, 3, 4): 1 + 1 + 3 == 5
 * - (0, 2, 3, 4): 1 + 1 + 3 == 5
 * - (1, 2, 3, 4): 1 + 1 + 3 == 5
 */

public class CountQuadruplets {
    public static void main(String[] args) {
        System.out.println(new CountQuadruplets().countQuadruplets(new int[]{1, 1, 1, 3, 5}));
    }
    // ����
    public int countQuadruplets(int[] nums) {
        int n = nums.length, ans = 0;
        for (int a = 0; a < n; a++) {
            for (int b = a + 1; b < n; b++) {
                for (int c = b + 1; c < n; c++) {
                    for (int d = c + 1; d < n; d++) {
                        if (nums[a] + nums[b] + nums[c] == nums[d]) ans++;
                    }
                }
            }
        }
        return ans;
    }

    // TODO ��ϣ ����
}
