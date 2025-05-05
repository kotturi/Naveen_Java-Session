package Pracetice;

public class MethodOverloadingRiding {
	
	public void test()
	{
		System.out.println("No/0 params");
	}
	
	public void test(int i)
	{
		System.out.println("1 params"+i);
	}
	
	public void test(int j,int k)
	{
		System.out.println("2 params"+j+k);
	}
	public static void main(String[] args)
	{
		MethodOverloadingRiding d= new MethodOverloadingRiding();
		d.test();
		
	}

}
