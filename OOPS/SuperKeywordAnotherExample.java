
class VehicleMan{  
	VehicleMan(){System.out.println("Vehicle is Manufactured");}  
}

class Trucks extends VehicleMan{  
	Trucks(){  
	System.out.println("Truck is created");  
}  
}  

public class SuperKeywordAnotherExample {
	public static void main(String[] args) {	
		Trucks t=new Trucks();  
	}
}
