package InterviewPractice;

public class MethodOverloading {

	public void test()
	{
		System.out.println("0 Params");
	}
	
	public void test(String a)
	{
		System.out.println("1 string Params");
	}
	public int test(int a)
	{
		System.out.println("1 string Params");
		return 100;
	}
	public void test(int a, String b)
	{
		System.out.println("2 datatype Params");
	}
	public void test(String a, int b)
	{
		System.out.println("2 datatype Params");
	}
	
	
	
	public static void main(String[] args) {
		MethodOverloading e= new MethodOverloading();
		e.test(2);
		e.test("jo");//call by value
		
	}

}
