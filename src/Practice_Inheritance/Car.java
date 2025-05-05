package Practice_Inheritance;

public class Car extends Vehicle{
	
	public void start()
	{
		System.out.println("Car -- Start");
	}
	
	public void stop()
	{
		System.out.println("Car -- Stop");
	}
	
	public final void finalMethod()
	{
		System.out.println("Car--final Keyword Method");
	}
	public void refuel()
	{
		System.out.println("Car -- refuel");
	}
	@Override
	public void engine()
	{
		System.out.println("car engine");
	}
	
	public static void billing()
	{
		System.err.println("Car- My car billing");
	}
	public static void taxation()
	{
		System.err.println("Car- taxation");
	}

	public static int milage(int a)
	{
		System.out.println("Car -- milage:Overloaded with int");
		return 10;
	}
	public static String milage(String a)
	{
		System.out.println("Car -- milage:Overloaded with String");
		return "a";
	}
}
