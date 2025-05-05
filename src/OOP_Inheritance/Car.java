package OOP_Inheritance;

public class Car extends Vehicle{

	public void start()
	{
		System.out.println("car------Start.");
	}
	
	public final void info()
	{
		System.out.println("Car----INFO(final)");
	}
	public void stop()
	{
		System.out.println("car------Stop.");
	}
	public void refuel()
	{
		System.out.println("car------refuel.");
	}
	@Override
	public void engine()
	{
		System.out.println("CAR--engine");
	}
	
	public static void billing()
	{
		System.out.println("Car---Billing");
	}
	public static void taxation()
	{
		System.out.println("Car---taxation");
	}
	private static void rating()
	{
		System.out.println("Car---rating");
	}
}
