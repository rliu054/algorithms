public class MergeSortedArray {

	public static void main(String[] args) {
		int a[] = {2, 3, 5, 0, 0, 0};
		int b[] = {1, 4, 6};
		merge(a, 3, b, 3);
		
		for (int i = 0; i < 6; i++) {
			System.out.print(a[i] + "\t");
		}
	}
	
	public static void merge(int A[], int m, int B[], int n) {
		int i = m - 1;
		int j = n - 1;
		int pos = m + n - 1;
		
		while ((i >= 0) && (j >= 0)) {
			if (A[i] >= B[j]) {
				A[pos--] = A[i--];
			} else {
				A[pos--] = B[j--];
			}
		}
		if (j >= 0)
			while (j >= 0)
				A[pos--] = B[j--];
	}

}
