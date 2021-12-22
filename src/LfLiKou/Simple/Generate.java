package LfLiKou.Simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liangfan
 * @Date: 2021-12-22 16:34
 * @Description: 杨辉三角
 * 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 * 输入: numRows = 5
 * 输出: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 */

public class Generate {
    public static void main(String[] args) {
        List<List<Integer>> generate = generate(5);
        System.out.println(generate.toString());
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            if ( i  == 0) {
                List<Integer> sList = new ArrayList<>();
                sList.add(1);
                list.add(sList);
            } else if (i - 1 >= 0) {
                List<Integer> sList = new ArrayList<>();
                List<Integer> fList = list.get(i - 1);
                int len = fList.size();
                for (int j = 0; j < i + 1; j++) {
                    if (j == 0) {
                        sList.add(1);
                    } else if (j == i) {
                        sList.add(1);
                    } else {
                        sList.add(fList.get(j-1) + fList.get(j));
                    }
                }
                list.add(sList);
            }
        }
        return list;
    }
}
