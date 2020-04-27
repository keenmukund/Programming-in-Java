import java.io.*;
public class SelectionSort {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of elements for selection sort");
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		System.out.println("Enter the elements");
		String str[] = br.readLine().split("\\s+");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
 		sortArray(arr, n);
	}
	static void sortArray(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			int min = i;
			for(int j = i; j < n; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			if (min != i) {
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
			for (int next : arr) {
				System.out.print(next+" ");
			}
			System.out.println();
		}
	}
}
