package ExceptionHandling;

public class Employee {
	String name;
	public static void main(String[] args) {

		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		try {
			int a[]=new  int [2];
			a[2]=122;//AIOB
			 
			 
			int i = 9 / 0;//AE
			Employee obj= new Employee();
			obj=null;
			obj.name="Jyothi";//NPE
		} 
		//best way is write all exceptions not single exception
		catch (ArithmeticException e) {
			System.out.println("AE is coming");
			e.printStackTrace();
		}
		catch (NullPointerException n) {
			n.printStackTrace();

		 }
		catch(RuntimeException q)
		{
			System.out.println("some exception");
			q.printStackTrace();
		}
		System.out.println("bye");
	}

}
