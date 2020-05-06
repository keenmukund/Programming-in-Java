import java.io.*;
public class SieveofEratosthenes {
	
	public static void main (String args[]) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any number");
		int n = Integer.parseInt(br.readLine());
		boolean arr[] = new boolean[n+1];
		for (int i = 0; i < n; i++) {
			arr[i] = true;
		}
		for (int p = 2; p*p <= n; p++) {
			if (arr[p] == true) {
				for(int i = p*p; i <= n; i += p) {
					arr[i] = false;
				}
			}
		}
		
		for (int i = 2; i < n; i++) {
			if (arr[i] == true)
				System.out.print(i +" ");
		}
	}
}

