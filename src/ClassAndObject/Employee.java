package ClassAndObject;

public class Employee {

	String name;
	int sal;
	final static String deptName = "jyothi";
	static int age = 30;

	public static void main(String[] args) {
		String a;
		System.out.println(new Employee().name = "jjjj");
		System.out.println(deptName);
		System.out.println(age);
		//deptName="aaaa";
		age = 40;
		System.out.println(deptName);
		System.out.println(age);
	}
}
