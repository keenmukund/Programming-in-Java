import java.util.*;
public class ReverseStack {
	
	static Stack<Integer> st = new Stack<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=sc.nextInt();
		System.out.println("Enter elements of stack(Integers)");
		for(int i=0;i<n;i++) {
			st.push(sc.nextInt());
		}
		System.out.println("Original Stack\n"+st);
		reverse();
		System.out.println("Reversed Stack\n"+st);

	}
	public static void insertAtBottom(int x) {
		if(st.isEmpty()) {
			st.push(x);
		}
		else {
			int a=st.peek();
			st.pop();
			insertAtBottom(x);
			st.push(a);
		}	
	}
	public static void reverse() {
		if(st.size()>0){
			int a = st.peek();
			st.pop();
			reverse();
			insertAtBottom(a);
		}
		
	}
}
	


