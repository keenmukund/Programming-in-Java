import java.util.*; 
public class BrianKernighnan {
	
	/* Java program to Count set bits in an integer */ 
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a non zero integer");
		int a = sc.nextInt();
		int count = 0;
		while (a != 0) {
			a &= a-1;
			count++;
		}
		System.out.println(count);
	}
}
