import java.util.*;
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] num) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        int pre = num[0];
        ArrayList<Integer> num_new = new ArrayList<Integer>();
        Arrays.sort(num);
        for (int i = 1; i < num.length; i++) {
            if (num[i] != pre) {
                num_new.add(num[i]);
                pre = num[i];
            }
        }

        for (int i = 0; i < num_new.size(); i++) {
            if (map.containsKey(num_new[i])) {
                map.put(num_new[i], map.get(num_new[i])+1);
            } else {
                map.put(num_new[i], 1);
            }
        }

        for (int i = 0; i < num_new.size(); i++) {
            map.put(num_new[i], map.get(num_new[i])-1);
            for (int j = i + 1; j < num_new.size(); j++) {
                map.put(num_new[j], map.get(num_new[j])-1);
                if (map.containsKey(0-num_new[i]-num_new[j]) 
                    && (map.get(0-num_new[i]-num_new[j])) > 0) {
                    List<Integer> ans = new ArrayList<Integer>();
                    ans.add(num_new[i]);
                    ans.add(num_new[j]);
                    ans.add(0-num_new[i]-num_new[j]);
                    res.add(ans);
                }
            }
        }
        return res;
    }
}
