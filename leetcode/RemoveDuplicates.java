
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 2, 3, 3, 3, 5};
		int[] b = {};
		int[] c = {1, 2};
		int[] d = {1, 1};
		print(a);
		print(b);
		print(c);
		print(d);
		
	}
	
	public static void print(int[] a) {
		int res = removeDuplicates(a);
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + "\t");
		System.out.println();
		System.out.println(res);
	}
	
	public static int removeDuplicates(int[] A) {
		if (A.length == 0)
			return 0;
		
		int value = A[0];
		int i = 1, j = 1;
		
		for (j = 1; j < A.length; j++) {
			if (A[j] != value) {
				A[i] = A[j];
				value = A[j];
				++i;
			}
		}
		return i;
	}

}
