class ClassInfo{
	int rollno;  
	String name;  
	 
	
ClassInfo(int rollno,String name){  
this.rollno=rollno;  
this.name=name;  
  
	}  
	void display(){System.out.println(rollno+" "+name);}  
	}  
	


public class ThisDemo {

	public static void main(String[] args) {
		ClassInfo c1=new ClassInfo(10,"John");  
		ClassInfo c2=new ClassInfo(12,"Annie");  
		c1.display();  
		c2.display(); 

	}
}
