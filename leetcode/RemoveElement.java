import java.util.*;
public class RemoveElement {

	public static void main(String[] args) {
		int[] a = new int[5];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			a[i] = in.nextInt();
		}
		int elem = in.nextInt();
		
		System.out.println(removeElement(a, elem));
		for (int i = 0; i < a.length; ++i) {
			System.out.print(a[i]);
		}

	}
	
	public static int removeElement(int[] A, int elem) {
		if (A.length == 0)
			return 0;
		int j = A.length - 1;
		for (int i = 0; (i <= j) && (j >= 0); i++) {
			if (A[i] == elem) {
				if (A[j] != elem) {
					A[i] = A[j];
					A[j] = elem;
					--j;
				} else {
					--i;
					--j;
				}
			}
		}
		return j >= 0 ? (j + 1) : 0;
	}

}
