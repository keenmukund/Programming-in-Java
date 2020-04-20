
public class String_buffer {

	public static void main(String[] args) {
		
		//Creating StringBuffer and append method
		StringBuffer s=new StringBuffer("Welcome to java!");
		s.append("Happy Learning");
		System.out.println(s);
		
		//insert method
		s.insert(0, 'w');
		System.out.println(s);
		
		//replace method
		StringBuffer sb=new StringBuffer("Hello");
		sb.replace(0, 2, "hEl");
		System.out.println(sb);
		
		//delete method
		sb.delete(0, 1);
		System.out.println(sb);
		
		StringBuffer s1=new StringBuffer("github");
		System.out.println(s1.reverse());
		
		System.out.println(s1.capacity());
	}

}

