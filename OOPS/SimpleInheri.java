

class Vehicle{  
void property(){System.out.println("Because it has wheels");}  
} 

class Bike extends Vehicle{  
void run(){System.out.println("Bike is running");}  
}  

public class SimpleInheri {

	public static void main(String[] args) {
		Bike d=new Bike();  
		d.run();  
		d.property();  
	}
}
