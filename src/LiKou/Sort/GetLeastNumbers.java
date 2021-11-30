package LiKou.Sort;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author: liangfan
 * @Date: 2021-11-26 10:10
 * @Description:
 * ������������ arr ���ҳ�������С�� k ���������磬����4��5��1��6��2��7��3��8��8�����֣�����С��4��������1��2��3��4��
 */
public class GetLeastNumbers {
    public static void main(String[] args) {
        int[] ints = {3,4,5,7,1,2};
        int[] leastNumbers = getLeastNumbers(ints, 3);

        System.out.println(Arrays.toString(leastNumbers));
    }
    public static int[] getLeastNumbers(int[] arr, int k) {
        int temp ;
        for (int i = 0; i < k ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return Arrays.copyOf(arr, k);
    }
}
