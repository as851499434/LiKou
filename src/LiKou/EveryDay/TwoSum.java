package LiKou.EveryDay;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: liangfan
 * @Date: 2021-12-13 16:05
 * @Description:
 * ����һ���������� nums��һ������Ŀ��ֵ target��
 * �����ڸ��������ҳ� ��ΪĿ��ֵ target �����������������������ǵ������±ꡣ
 * ����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ�������ͬһ��Ԫ���ڴ��ﲻ���ظ����֡�
 * ����԰�����˳�򷵻ش𰸡�
 * ���룺nums = [2,7,11,15], target = 9
 * �����[0,1]
 * ���ͣ���Ϊ nums[0] + nums[1] == 9 ������ [0, 1] ��
 */

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        twoSum(nums,9);
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }

}
