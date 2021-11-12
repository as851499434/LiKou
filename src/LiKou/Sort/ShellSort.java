package LiKou.Sort;

/**
 * @Author: liangfan
 * @Date: 2021-11-11 16:26
 * @Description: ϣ������
 */
public class ShellSort {
    public void shellSort(int[] arr) {
        //step:����
        for (int step = arr.length / 2; step > 0; step /= 2) {
            //��һ������������бȽ� [step,arr.length)
            for (int i = step; i < arr.length; i++) {
                int value = arr[i];
                int j;

                //�Բ��������о����Ԫ�ؽ��бȽ�
                for (j = i - step; j >= 0 && arr[j] > value; j -= step) {
                    //jΪ�������ȡֵ��j+stepΪ��������������Ķ�Ӧֵ��
                    arr[j + step] = arr[j];
                }
                //��ʱstepΪһ��������[j + step]Ϊ�������ϵĳ�ʼ����ֵ
                arr[j + step] = value;
            }
        }
    }
}
