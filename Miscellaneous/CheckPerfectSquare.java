import java.util.*;
class CheckPerfectSquare {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer");
		int x = sc.nextInt(); 
		System.out.println(isPerfectSquare(x));
	}	


    public static boolean isPerfectSquare(int num) {
        
   	if (num < 1) return false;
      	if (num == 1) return true;
      	long t = num / 2;
      	while (t * t > num) {
        	t = (t + num / t) / 2;
      	}
      	return t * t == num;
    }
}
