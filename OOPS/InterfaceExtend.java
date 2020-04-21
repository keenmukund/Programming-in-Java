package module3;




	
interface Walkable{  
	void walk();  
} 

interface Runnable extends Walkable{  
	void run();  
}  

class InterfaceExtend implements Runnable{  
	public void walk(){System.out.println("Interface: Walkable");}  
	public void run(){System.out.println("Interface: Runnable");}  
	

	public static void main(String[] args) {
		InterfaceExtend obj = new InterfaceExtend();  
		obj.walk();  
		obj.run();  
	}
}

