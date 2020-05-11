import java.util.*;
public class XorSwapNumbers {
	/* swap two numbers using xor operator */
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers to swap");
		int a = sc.nextInt();
		int b = sc.nextInt();		
		System.out.println("Values of a and b are "+a+" "+b);
		a = a ^ b;
		b = b ^ a;
		a = a ^ b;
		
		System.out.println("After swapping Values of a and b are "+a+" "+b);
	}

}
