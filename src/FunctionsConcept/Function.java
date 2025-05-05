package FunctionsConcept;

public class Function {
//function/Method
	public void test() // no input & no return type
	{
		System.out.println("test method");
	}

	public void test1() // no input & no return type
	{
		int a = 100;
		int b = 200;
		int c = a + b;
		System.out.println("sum: " + c);
	}

	public static void test2() // no input & return type
	{
		int a = 100;
		int b = 200;
		int c = a + b;
		System.out.println(c);
		return;
	}

	public double test3() // no input & return type
	{
		double a = 100.23;
		int b = (int) 200.33;
		double c = a + b;
		return c;
	}

	// Addition
	public int sum(int a, int b) {
		System.out.println("Addition Method");
		int c = a + b;
		return c;
	}

	// Subtration
	public int sub(int a, int b) {
		System.out.println("Subtration Method");
		int c = a - b;
		return c;
	}

	// Multiplication
	public int mul(int a, int b) {
		System.out.println("Multiplication Method");
		int c = a * b;
		return c;
	}

	// Division
	public int div(int a, int b) {
		System.out.println("Division Method");
		int c = a / b;
		return c;
	}

	public static void main(String[] args) {

		Function f = new Function();
		int a = f.sum(20, 10);
		System.out.println(a);
		int d = f.div(20, 4);
		System.out.println(d);
		int s = f.sub(33, 11);
		System.out.println(s);
		int m = f.mul(4, 6);
		System.out.println(m);

		/*
		 * f.test(); f.test1(); double s1=f.test3(); System.out.println(s1+10); test2();
		 */
	}

}
