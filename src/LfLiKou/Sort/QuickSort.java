package LfLiKou.Sort;

import java.util.Arrays;

/**
 * @Author: liangfan
 * @Date: 2021-11-26 13:15
 * @Description: øÏÀŸ≈≈–Ú
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] ints = {4,2,3,1,5,6};
        int[] ints1 = quickSort(ints);
        System.out.println(Arrays.toString(ints1));
    }
    public static int[] quickSort(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            return arr;
        }
        int l = arr[0];
        int i = 1;
        int j = arr.length - 1;
        int temp;
        while(i < j) {
            while (i < j && arr[i] <= l ) i++;
            while (i < j && arr[j] >= l ) j--;
            if (i == j) {
                temp = arr[i];
                arr[i] = l;
                arr[0] = temp;
            } else {
                temp = arr[i];
                arr[j] = temp;
                arr[i] = arr[j];
            }
        }

        return arr;
    }
}
