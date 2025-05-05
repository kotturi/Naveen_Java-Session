package OOP_Inheritance;

public class BMW extends Car{

	@Override
	public void start()
	{
		System.out.println("BMW------Start.");
	}	
	public void autoParking()
	{
		System.out.println("BMW---auto Parking");
	}
	@Override
	public void engine()
	{
		System.out.println("BMW--engine");
		Truck tr= new Truck(); //Create obj call 
		tr.Transport();//composion
	}
	
	public static void billing()
	{
		System.out.println("BMW---Billing");
	}
	
	private static void rating()
	{
		System.out.println("BMW---rating");
	}
	
	
	
}
