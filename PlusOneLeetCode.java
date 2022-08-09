package Leetcoede;

public class PlusOneLeetCode {

	static int[] Plusone(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 9) {
				a[i] = a[i] + 1;
				break;
			}
			else {
				a[i] = 0;
			}
		}

		if (a[0] == 0) {
			int[] b = new int[a.length + 1];
			b[0] = 1;
			return b;
		}
		return a;
	}
	public static void main(String[] args) {
		int a[] = { 9 };

		int[] arr = Plusone(a);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
