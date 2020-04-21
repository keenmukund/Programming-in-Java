package module3;

interface Walk{  
void walk();  
}  

interface Run{  
void run();  
}  

class animal implements Walk, Run{
	public void walk(){
		System.out.println("Walkable interface is getting executed");	}
	
	public void run()
	{System.out.println("Rannable interface is getting executed");}  
}

//Implementation: by second user  
class Human extends animal {  
//public void Operation(){System.out.println("Debiting the money from the account");}  
}  


public class OneClassMultipleImplement {

	public static void main(String[] args) {
		 Walk h1=new Human();
		 Run h2=new Human();
		 h1.walk();
		 h2.run();
	}
}
