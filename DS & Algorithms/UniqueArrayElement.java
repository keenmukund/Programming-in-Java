import java.util.*;
public class UniqueArrayElement {
	/* given an array find the element which occurs only once. All other elements occur twice */
	
	
	public static void main (String args[]) {
		System.out.println("Enter number of elemnts");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter all but one duplicate elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int result = arr[0];
		for (int i = 1; i < n; i++) {
			result = result ^ arr[i];
		}
		System.out.println(result);
	}

}
