package LfLiKou.EveryDay;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liangfan
 * @Date: 2022-01-11 13:53
 * @Description:
 */

public class GrayCode {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(grayCode2(4));
    }
    public static List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();
        ans.add(0);
        while (n-- > 0) {
            int m = ans.size();
            for (int i = m - 1; i >= 0; i--) {
                ans.set(i, ans.get(i) << 1);
                ans.add(ans.get(i) + 1);
            }
        }
        return ans;
    }

    public static List<Integer> grayCode2(int n) {
        List<Integer> res = new ArrayList<Integer>() {{ add(0); }};
        int head = 1;
        for (int i = 0; i < n; i++) {
            for (int j = res.size() - 1; j >= 0; j--)
                res.add(head + res.get(j));
            head <<= 1;
        }
        return res;
    }

}
