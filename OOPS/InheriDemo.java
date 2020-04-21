

class Manager
{
	int salary=100000;
}

class Employee2 extends Manager
{
	int id=15;
	int empSal=25000;
}

public class InheriDemo {

	public static void main(String[] args) {
		
		Employee2 e=new Employee2();
		System.out.println("Employee with id "+e.id+" gets "+e.empSal+" every month");
		System.out.println("Manager's salary is "+e.salary);
	}
}
