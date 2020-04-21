

abstract class Car{  
	
	   Car(){
			System.out.println("Car is an abstract class");
		}  
	   abstract void run();  
	 }  
	  
	 class Maruti extends Car{  
	 void run(){
			System.out.println("Maruti is the derived class");
		   }  
	 }  


public class AbstDemo {

	public static void main(String[] args) {
		
		Car obj = new Maruti();  
		  obj.run();  
		  
	}

}

