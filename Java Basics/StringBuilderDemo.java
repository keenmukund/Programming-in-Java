
public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder("Happy");
		sb1.append("Learning");
		System.out.println(sb1);
		
		System.out.println(sb1.delete(0, 1));
		
		System.out.println(sb1.insert(1, "Welcome"));
		
		System.out.println(sb1.reverse());
	}
}
