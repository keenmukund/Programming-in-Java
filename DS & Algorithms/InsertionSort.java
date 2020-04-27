import java.io.*;
public class InsertionSort {
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
 		sortArray(arr, n);
	}
	static void sortArray(int arr[], int n){
		for (int i = 0; i < n; i++) {
			int pos = i;
			while (pos >= 1 && arr[pos] < arr[pos - 1]) {
				int temp = arr[pos];
				arr[pos] = arr[pos - 1];
				arr[pos - 1] = temp;
				pos -= 1;
			}
			for (int next : arr) {
				System.out.print(next+" ");
			}
			System.out.println();
		}
	}
}
