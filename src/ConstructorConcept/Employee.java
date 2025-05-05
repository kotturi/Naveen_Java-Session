
package ConstructorConcept;

public class Employee {

	String name;
	int age;
	double salary;
	String dob;
	
	//Constructor
	public Employee()//0 param- default
	{
		System.out.println("0 param constructor");
	}
	public Employee(int i)//0 param- default
	{
		System.out.println("1 param constructor: "+i);
	}
	public Employee(String j,int i)//0 param- default
	{
		System.out.println("2 param constructor: "+j+i);
	}
	public static void main(String[] args) {

		Employee e=new Employee();
		//Employee e= new Employee("jo",10);
		
	}

}
