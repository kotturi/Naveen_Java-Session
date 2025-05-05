package Encapsulation;

public class Employee {

	private String name;
	private int age;
	private double salary;

	// public getter and setter

	public String getName() {
		return name;
	} 

	public Employee(String name, int sal) {
		this.name = name;
		this.sal = sal;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		if (sal <= 1000) {
			this.sal = sal;
		} else
			System.out.println("salary should be less 1000");
	}

	public static void main(String[] args) {

		Employee e1 = new Employee("JO", 123);
		// e.name="jyothi";

	}

	private void pMethod() {
		System.out.println("pMethod");
	}

}
