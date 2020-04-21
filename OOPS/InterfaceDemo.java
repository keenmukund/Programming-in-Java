

//Interface declaration: by first user  
interface Money{  
void Operation();  
}  
//Implementation: by second user  
class Debit implements Money{  
public void Operation(){System.out.println("Debiting the money from the account");}  
}  
class Credit implements Money{  
public void Operation(){System.out.println("Crediting the money to the account");}  
}

//Using interface: by third user 
public class InterfaceDemo {

	public static void main(String[] args) {
		
		Money d=new Credit();//In real scenario, object is provided by method  
		d.Operation();  
	}
}
