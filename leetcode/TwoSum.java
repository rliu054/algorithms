import java.util.*;
public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                if (target == 2 * numbers[i]) {
                    result[0] = map.get(numbers[i]);
                    result[1] = i;
                    break;
                }
            } else {
                map.put(numbers[i], i);
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            map.remove(numbers[i]);
            if (map.containsKey(target - numbers[i])) {
                result[0] = i + 1;
                result[1] = map.get(target - numbers[i]) + 1;
                break;
            }
        }
        return result;
    }
}
