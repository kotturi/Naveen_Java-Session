package ConstructorConcept;

public class User {
	String name;
	int age;
	double salary;
	String dob;
//	public User()
//	{
//		System.out.println("Default");
//	}
	public User(String name, int age)
	{
		System.out.println("2 Param"+name+age);
		this.name=name;
		this.age=age;
	}
	public User(String name, int age,Double salary)
	{
		System.out.println("3 Param");
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	public static void main(String[] args) {

		//User u1= new User();
		User u2= new User("Jyothi",39);
		System.out.println(u2.name+" "+u2.age+" "+u2.salary);
		User u3= new User("swathi",41,23.22);
		System.out.println(u2.name+" "+u2.age+" "+u3.salary);
		
		
	}

}
