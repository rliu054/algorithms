import java.util.*;
public class SingleNumber {
   public static void main(String args[]) {
      int[] list = {1, 2, 3, 2, 1};
      System.out.println(singleNumber(list));
   }

   public static int singleNumber(int[] A) {
      HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
      for (int i = 0; i < A.length; i++) {
         if (map.containsKey(A[i]))
            map.put(A[i], 2);
         else 
            map.put(A[i], 1);
      }

      int result = -1;

      for (int i = 0; i < A.length; i++) {
         if (map.get(A[i]) == 1) {
            result = A[i];
            break;
         }
      }
      return result;
   }
}
