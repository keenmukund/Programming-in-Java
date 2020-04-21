package module3;

class Vehicle1{  
void run3(){System.out.println("Vehicle is the parent class");}  
} 

class Bike1 extends Vehicle1{  
void run2(){System.out.println("Bike has some properties of a Vehicle");}  
}  

class Cycle extends Bike1{  
void run1(){System.out.println("Cycle has some properties of Bike");}  
}  

public class MultilevelInheritance {
	public static void main(String[] args) {
		Cycle c=new Cycle();  
		c.run1();  
		c.run2();  
		c.run3(); 
	}
}
