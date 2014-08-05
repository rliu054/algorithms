import java.util.*;
public class ThreeSumSlow {
    public static void main(String args[]){
        int[] list = {0, 0, 0};
        int[] list2 = {-1, 0, 1};

        System.out.println(threeSum(list));
        System.out.println(threeSum(list2));
    }

    public static List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        for (int i = 0; i < num.length; i++){
            for (int j = i + 1; j < num.length; j++) {
                for (int k = j + 1; k < num.length; k++) {
                    System.out.println(num[i] + num[j] + num[k]);
                    if (num[i] + num[j] + num[k] == 0) {
                        List<Integer> ans = new ArrayList<Integer>();
                        ans.add(i);
                        ans.add(j);
                        ans.add(k);
                        res.add(ans);
                    }
                }
            }
        }
        return res;
    }
}
