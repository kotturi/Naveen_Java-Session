package Encapsulation;

public class EmployeeTest {

	
	public static void main(String[] args) {
		//POST- create
		Employee e= new Employee("jo",1000);
		Employee e2= new Employee();
		e2.n
		
		System.out.println(e.getName());
		System.out.println(e.getSal());
		
		//update--PUT
		e.setSal(999);
		
		//Read GET
		System.out.println(e.getName()+ " "+e.getSal());
		
	}

}
