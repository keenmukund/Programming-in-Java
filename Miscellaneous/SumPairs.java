import java.util.*;
public class SumPairs {
	/* Given an array and a number find all pairs of array elements with the given sum */
	public static void main (String args[]) {
		System.out.print("Please Enter the number of elements\n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("Please Enter the array elements\n");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Please Enter the sum\n");
		int sum = sc.nextInt();
		Arrays.sort(arr);
		int left = 0, right = n-1;
		while (left < right) {
			if (arr[left] + arr[right] == sum) {
				System.out.print(arr[left]+" "+arr[right]+" "+sum);
				System.out.println();
				right--;
			}
			else if (sum < arr[left] + arr[right])
				right--;
			else
				left++;
		}
	}
	
	
}
