package Practice_Constructors;

public class Employee {

	String name;
	int age;
	
	
	  public Employee() { System.out.println("Default 0 param const..."); }
	 	
	public Employee(String name, int age) {
		System.out.println("Default 2 param const...");
		this.name= name;
		this.age=age;
	
	}

	public static void main(String[] args) {

		Employee e = new Employee("jo",40);
		System.out.println(e.name);
		System.out.println(e.age);
	}
}
