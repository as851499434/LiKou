package LfLiKou.DynamicProgram;

/**
 * @Author: liangfan
 * @Date: 2021-12-16 14:19
 * @Description: ʢ���ˮ������
 * ���� n ���Ǹ����� a1��a2��...��an��ÿ�������������е�һ����(i,ai) ��
 * �������ڻ� n ����ֱ�ߣ���ֱ�� i�������˵�ֱ�Ϊ(i,ai) �� (i, 0) ��
 * �ҳ����е������ߣ�ʹ��������x�Ṳͬ���ɵ�����������������ˮ��
 * ˵�����㲻����б������
 * ���룺[1,8,6,2,5,4,8,3,7]
 * �����49
 * ���ͣ�ͼ�д�ֱ�ߴ����������� [1,8,6,2,5,4,8,3,7]���ڴ�����£������ܹ�����ˮ����ʾΪ��ɫ���֣������ֵΪ49��
 */

public class MaxArea {
    public static void main(String[] args) {
        MaxArea maxArea = new MaxArea();
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea.maxArea(arr) );
    }
    //��β˫ָ��
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while (left != right) {
            max = Math.max(max,(right - left) * Math.min(height[left],height[right]));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }

    //��ʱ
    public int maxArea2(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
                max = Math.max(max, (j-i) * Math.min(height[i],height[j]));
            }
        }
        return max;
    }
}
