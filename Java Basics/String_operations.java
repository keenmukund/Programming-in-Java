
public class String_operations {

	public static void main(String[] args) {
		//String Comparison
		String s1="Hello";
		String s2="Heldo";
		String s3="Helpo";
		String s4="";
		
		//Length of string
		String sl=new String("Hello World");
		System.out.println(sl.length());
		
		//substring
		String sub=new String("Welcome");
		System.out.println(sub.substring(2));
		
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		
		//IsEmpty
		System.out.println(s4.isEmpty());
		
		//toLowerCase
		System.out.println(s2.toLowerCase());
		//toUpperCase
		System.out.println(s2.toUpperCase());
		
		//ValueOf
		int a=50;
		String s=String.valueOf(a);
		System.out.println(s);
	
		//replace
		String replace=s2.replace('d', 'l');
		System.out.println(replace);
		
		//contains
		System.out.println(replace.contains("h"));
		
		//equals
		String x="Welcome to Coding";
		String y="WeLcOmE tO cOding";
		System.out.println(x.equals(y));
		
		//charAt
		System.out.println(x.charAt(3));
		
		//endsWith
		String p="Happy Learning";
		System.out.println(p.endsWith("u"));
		

	}
}
