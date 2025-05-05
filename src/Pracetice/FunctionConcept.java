package Pracetice;

public class FunctionConcept {
	
	public static void main(String[] args) {
		FunctionConcept u=new FunctionConcept();
		u.test();
		int s=u.add();
		System.out.println("return"+s);
		int p=u.add1(10, 20);
		System.out.println("sum"+p);
	}
	//1
	public void test()
	{
		System.out.println("NO input & No return");
	}
	//2
	public int add()
	{
		System.out.println("NO input & some return");
		int a=100; int b=200;
		int c= a+b;
		return c;
	}
	//3
	public int add1(int a, int b)
	{
		System.out.println(" input & some return");
		int c= a+b;
		return c;
	}
	
	

}
