import java.util.*;
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> ans = new ArrayList<Integer>();

        for (int i = 0; i < num.length; i++){
            for (int j = i + 1; j < num.length; j++) {
                for (int k = j + 1; k < num.length; k++) {
                    if (num[i] + num[j] + num[k] == 0) {
                        ans.add(i);
                        ans.add(j);
                        ans.add(k);
                        res.add(ans);
                        ans.clear();
                    }
                }
            }
        }
        return res;
    }
}
