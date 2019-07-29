package lab5;

import java.util.ArrayList;
import java.util.List;

public class prob5 {

	static void SubsetSum(int arr[], int n, List<Integer> l, int sum) {

		if (sum == 0) {
			for (int i = 0; i < l.size(); i++)
			System.out.print(l.get(i) + " ");
			System.out.println();
			return;
		}

		if (n == 0)
			return;


		SubsetSum(arr, n - 1, l, sum);
		List<Integer> v1 = new ArrayList<Integer>(l);
		v1.add(arr[n - 1]);
		SubsetSum(arr, n - 1, v1, sum - arr[n - 1]);
	}

	public static void main(String args[]) {
		int arr[] = { 3, 8, 10, 14, 16, 11, 33 };
		int sum = 25;
		int n = arr.length;
		List<Integer> l = new ArrayList<Integer>();
		SubsetSum(arr, n,l, sum);

	}
}
