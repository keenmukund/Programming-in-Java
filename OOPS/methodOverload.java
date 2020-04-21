
public class methodOverload {
	
	public void display(int x)
	{
		System.out.println("Welcome to integers");
	}
	public void display(String y)
	{
		System.out.println("Welcome to Strings");
	}
	
	public static void main(String[] args) {
		methodOverload mo=new methodOverload();
		
		String s="Hello";
		mo.display(s);
		mo.display(12);
	}

}
