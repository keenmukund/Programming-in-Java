import java.io.*;
public class SumOfPrimes {
	
	public static void main (String args[]) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any even number");
		int t = Integer.parseInt(br.readLine());
		primePair(t);
	}
	
	static void primePair(int n) {
		
		boolean arr[] = findAllPrimes(n);
		
		for (int i = 2; i < n; i++) {
			if (arr[i] == true && arr[n - i] == true) {
				System.out.println(i+" "+(n - i));
				return;
			}
		}
	}
	
	static boolean[] findAllPrimes(int n) {
		
		boolean arr[] = new boolean[n + 1];
		for (int i = 2; i <= n; i++) {
			arr[i] = true;
		}
		for (int p = 2; p <= n; p++) {
			if (arr[p] == true) {
				for (int i = p*p; i <= n; i+= p) {
					arr[i] = false;
				}
				
			}
		}
		return arr;
	}

}
