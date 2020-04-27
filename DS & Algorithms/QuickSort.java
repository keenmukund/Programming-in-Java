import java.io.*;
import java.util.Arrays;
public class QuickSort {
	public static void main (String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of elements for insertion sort");
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		System.out.println("Enter the elements");
		String str[] = br.readLine().split("\\s+");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
 		sort(arr, 0, n - 1);
	}
	static void sort(int arr[], int p, int r) {
		if (p < r) {
			int q = partition(arr, p, r);
			System.out.println(Arrays.toString(arr));
			sort(arr, p, q - 1);
			sort(arr, q+1, r);
		}
	}
	static int partition(int arr[], int p, int r) {
		int x = arr[r];
		int i = (p -1);
		for (int j = p; j <= r - 1; j++) {
			if (arr[j] <= x) {
				i += 1;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[r];
		arr[r] = temp;
		System.out.println(Arrays.toString(arr));
		return i + 1;
	}
}
